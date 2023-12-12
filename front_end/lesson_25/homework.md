## Homework

### Задание:

Создайте компоент Homework25.tsx.

В нем необходимо разработать форму для заполнения данных товара и кнопкой "Создать товар". После нажатия на кнопку, при условии прохождения описанной ниже валидации, должна создаваться, стилизованная по вашему усмотрению, карточка с данными товара

Элементы управления формой:
Название товара - тип поля: input; валидация: обязательное поле, тип данных string, минимальное количество символов - 2, максимальное количество символов - 50
"Цена товара" - тип поля: input; валидация: обязательное поле, может принимать только числа, максимальное количество символов - 15
"Описание товара" - тип поля: text area; валидация: максимальное количество символов - 150
"Правила использования" - тип поля: checkbox; значение по умолчанию - false; валидация: checkbox обязательный (true)
"Создать товар" - тип: кнопка с типом Submit. При клике на нее должна срабатывать валидация, если в полях есть ошибки, то карточка не создается. Если ошибок нет - карточка создается - данные для карточки кладите в отделный стейт при ее создании в виде обьекта и затем эти данные из стейта отображайте в карточке

Примечания:
Поля textarea и checkbox делать отдельными компонентами не нужно
Настройка формы и валидация должны быть выполнены с помощью Formik и Yup
Возле названия обязательных полей должна быть звёздочка
Плейсхолдеры на ваше усмотрение

## Домашнее задание: залейте код, сделайте pull request и пришлите мне в личку в слаке ссылку на пулл реквест, также пришлите мне архивом ваш проект(заархивировать нужно все, кроме node_modules)

### !!!Дедлайн: 07.12.2023: 21:00