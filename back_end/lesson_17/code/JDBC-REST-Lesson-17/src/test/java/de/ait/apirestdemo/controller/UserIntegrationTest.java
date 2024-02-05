package de.ait.apirestdemo.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test") // подключаем другой application.properties по имени его пакета test
@DisplayName("Endpoint /users is working: ")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class UserIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Nested
    @DisplayName("GET /users")
    public class GetUsers{

        @Test
        @Sql(scripts = {"/sql/schema.sql", "/sql/data_insert.sql"})
            public void return_list_of_users() throws Exception{
            mockMvc.perform(get("/api/users"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.size()", is(3)))
                    .andExpect(jsonPath("$.[0].id", is(1)))
                    .andExpect(jsonPath("$.[0].name", is("Pavel")))
                    .andExpect(jsonPath("$.[1].id", is(2)))
                    .andExpect(jsonPath("$.[1].name", is("Pavel1")));

        }



    }

    @Nested
    @DisplayName("POST /users")
    public class PostUsers {
        @Test
        @Sql(scripts = {"/sql/schema.sql", "/sql/data_insert.sql"})
        public void return_created_user() throws Exception {
            mockMvc.perform(post("/api/users").contentType("application/json")
                    .content("{\n" +
                            "  \"User id\": 1,\n" +
                            "  \"Name\": \"Leonid\",\n" +
                            "  \"email\": \"leo@mail.com\",\n" +
                            "  \"role\": \"USER\"\n" +
                            "}"))
                    .andExpect(jsonPath("$.id", is(4)))
                    .andExpect(status().isCreated());
        }
    }
}