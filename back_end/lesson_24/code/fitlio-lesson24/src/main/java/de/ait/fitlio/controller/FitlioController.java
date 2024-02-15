package de.ait.fitlio.controller;

import de.ait.fitlio.dto.FitlioDto;
import de.ait.fitlio.dto.NewFitlioDto;
import de.ait.fitlio.dto.StandardResponseDto;
import de.ait.fitlio.model.Fitlio;
import de.ait.fitlio.service.FitlioService;
import de.ait.fitlio.validation.dto.ValidationErrorsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static de.ait.fitlio.dto.FitlioDto.from;

@RequiredArgsConstructor
@RestController
@Tags(@Tag(name = "Fitlio"))
@RequestMapping("/api/fitlio")
    public class FitlioController {
    private final FitlioService fitlioService;

    @Operation(summary = "Creation of new training", description = "Available for user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "New training is successfully created",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = FitlioDto.class))),
            @ApiResponse(responseCode = "400",
                    description = "Validation error",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ValidationErrorsDto.class)))
    })
    @PostMapping
    public ResponseEntity<FitlioDto> addFitlio(@RequestBody @Valid NewFitlioDto newFitlio) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(fitlioService.addFitlio(newFitlio));
    }

    @Operation(summary = "Get list of trainings", description = "Available for all")
    @GetMapping
    public ResponseEntity<List<FitlioDto>> getAllFitlio() {
        return ResponseEntity
                .ok(fitlioService.getAllFitlio());
    }

    @GetMapping("/{fitlio-id}")
    public FitlioDto getFitlio(@Parameter(description = "Identification of training", example = "1")
                               @PathVariable("fitlio-id") Long fitlioId) {
        return fitlioService.getFitlioById(fitlioId);

    }

//
//    @Operation(summary = "Получение курса", description = "Доступно всем пользователям")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200",
//                    description = "Запрос обработан успешно",
//                    content = @Content(mediaType = "application/json",
//                            schema = @Schema(implementation = FitlioDto.class))
//            )
//            @ApiResponse(responseCode = "404",
//                    description = "Тренировка не найдена",
//                    content = @Content(mediaType = "application/json",
//                            schema = @Schema(implementation = StandardResponseDto.class)))


//    @PostMapping("/{course-id}/lessons")
//    public ResponseEntity<LessonDto> addLessonToCourse(@PathVariable("course-id") Long courseId,
//                                                       @RequestBody @Valid NewLessonDto newLesson) {
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(coursesService.addLessonToCourse(courseId, newLesson));
//    }
//
//
//
//    @DeleteMapping("/{course-id}/lessons/{lesson-id}")
//    public ResponseEntity<LessonDto> deleteLessonFromCourse(@PathVariable("course-id") Long courseId,
//                                                            @PathVariable("lesson-id") Long lessonId) {
//        return ResponseEntity
//                .ok(coursesService.deleteLessonFromCourse(courseId, lessonId));
//    }
//
//    @PutMapping("/{course-id}/lessons/{lesson-id}")
//    public ResponseEntity<LessonDto> updateLessonInCourse(@PathVariable("course-id") Long courseId,
//                                                          @PathVariable("lesson-id") Long lessonId,
//                                                          @RequestBody @Valid UpdateLessonDto updateLesson) {
//        return ResponseEntity
//                .ok(coursesService.updateLessonInCourse(courseId, lessonId, updateLesson));
//    }
//
//    @PostMapping("/{course-id}/students")
//    public ResponseEntity<List<UserDto>> addStudentToCourse(@PathVariable("course-id") Long courseId,
//                                                            @RequestBody StudentToCourseDto studentData) {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(coursesService.addStudentToCourse(courseId, studentData));
//    }
//
//    @GetMapping("/{course-id}/students")
//    public ResponseEntity<List<UserDto>> getStudentsOfCourse(@PathVariable("course-id") Long courseId) {
//        return ResponseEntity.ok(coursesService.getStudentsOfCourse(courseId));
//    }
//
//

}
