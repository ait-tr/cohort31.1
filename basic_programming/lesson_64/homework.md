## Задание 1 Period, LocalDate (опциональное)
Сегодня возраст нашего героя - 50 лет, сколько лет ему было в 2007

## Задание 2 Todo лист - лист задач (опциональное)
Создайте класс Task с полями:
- title
- description
- status
- date - LocalDate
  С методами:
- switchStatus
- changeTitle(String title)

Пусть задача создается со статусом не выполнено.
Создайте лист задач. Пусть хотя бы одна будет на эту субботу.
Дополнительно:
- Поменяйте название на прописные буквы для тех задач,
  которые будут в течение 10 дней с настоящего момента.
- Поменяйте статус у задач, которые назначены на субботу.
- Напишите метод procrastinate - который откладывает задачу на один день.
- Отложите все задачи листа на один день.

## Задание 3  Achilles And The Tortoise
Создайте два потока: Ахилес (AchillesThread) и черепаха(TortoiseThread).
Пусть в потоке Ахилес выводится фраза "I run fast" с интервалом полсекунды 30 раз.
Пусть в потоке черепахи выводится фраза "I just run" c интервалом две секунды 12 раз.
**После** того как эти потоки завершат работу выведите в консоль фразу - "Achilles can never overtake the tortoise?"