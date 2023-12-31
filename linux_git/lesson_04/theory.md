## Базовые термины

- **рефакторинг** - перевыпуск (переработка) кода
- **алгоритм** - идея (способ) решения задачи (проблемы)
- **программа** - реализация алгоритма

## Пример названия веток

```bash
feature/payments
bugfix/login
```

## Безопасная отмена коммитов

```bash
git revert commit_id
```

## Просмотр журнала коммитов

```bash
git log
# q - для выхода
```

## Просмотр содержимого коммита

```bash
git show # последнего
git show commit_id # указанного
```

## Настройка редактора по умолчанию

```bash
git config --global core.editor "code --wait"
```

## Состояния файлов в Git

1. Не отслеживаемые (по умолчанию)
2. Отслеживаемым
3. Игнорируемые

## Просмотр состояния раб/каталога

```bash
git status -s
```

## Легенда (маркеры) `git status -s`

- `??` Untracked
- `D` Deleted
- `M` Modified
- `R` Renamed
- `A` Added

## Семантическое версионирование (`SemVer`)

- Методология (де-факто пром/стандарт) нумерации версий проекта (версионирование)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/9ead9339-7723-4574-8a6b-5421324c1609/Untitled.png)

### v`MAJOR`.`MINOR`.`PATCH`

`PATCH` - исправление багов, прочие мелкие правки

`MINOR` - улучшения (без нарушения обратной совместимости)

`MAJOR` - координальные изменения (с нарушением обратной совместимости)

## Решение проблемы на Windows

```bash
git config --global core.ignorecase false
```

## Просмотр текущей привязки

```bash
git remote -v
```

## Семантические коммиты (комментарии к комитам)

- один из вариантов подхода к написанию сообщения коммита
- `<type>(<scope>): <subject>`

**type / характер правки**

- `feat` новый функционал
- `fix` исправления багов
- `refactor` рефакторинг
- `style`
- `docs`
- `build`
- `test`
- `perf` оптимизация производительности

**Примеры**

```bash
feat(login): добавил...
fix: исправил ...

git commit -m 'fix(payments): исправил оплату через Apple Pay'
```

## Перезапись последнего коммита

применять только для НЕПУБЛИЧНЫХ ВЕТОК (КОММИТ)

```bash
# новый комментарий
git commit --amend -m 'update'

# не редактировать комментарий
git commit --amend --no-edit
```

## Сохранение незакомиченных изменений

```bash
git stash
git stash pop
```