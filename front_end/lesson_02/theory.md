# CSS

### HTML tags, elements.
Ссылка на презентацию: [CSS](https://github.com/ait-tr/cohort25/blob/main/front_end/lesson_02/css.pdf)

## Немного про id

* id должен быть уникальный в рамках страницы
* id всегда начинается не с цифры
* id может быть у каждого компонента

## Немного про классы

* Элементы страницы могут быть сгруппированы в классы, т.е. класс - это набор элементов станицы
* Элемент может принадлежать двум классам, тогда эти классы просто нужно перечислить через пробел

* CSS - каскадная таблица стилей
* Размещается в `<head>` с использованием тега `<style>`
* Синтаксис:

```
[селектор] {
    ключ1 : значение;
    ключ2 : значение;
}
```

## Селекторы

* Селектор позволяет выбрать элемент на странице, к которому нужно применить стиль

* Селектор по тегу - когда хотим, чтобы ВСЕ элементы определенного тега имели один стиль

```
h1 {
    color: red;
    text-align: right;
}
```

* Селектор по id - когда хотим, чтобы КОНКРЕТНЫЙ элемент имел определенный стиль (начинается с решетки)

```
#css_h1 {
    color: green;
    text-align: center;
}
```

* Селектор по классам - когда хотим, чтобы НАБОР элементов имел определенный стиль (начинается с точки)

```
.blue-words {
    color: blue;
}
```

* Селектор по тегу и классам - когда хотим, чтобы НАБОР элементов КОНКРЕТНОГО тега имел определенный стиль:

```
p.about-myself {
    color: brown;
}
```

* Универсальный селектор - применяется ко всем элементам на странице. Но, если в более специфичном селекторе указан компонент
* с аналогичным свойством, то будет выбрано это свойство.

```css
* {
    text-align: center;
}
```

* Сгруппированный селектор

```
.about-myself, .blue-words, #css_h1 {
    background-color: gray;
}
```

* Селектор `element element` - позволяет выбрать элементы внутри других элементов

```
#choice_a li {
    background-color: green;
}

#choice_b li {
    background-color: yellow;
}
```