# Java Developer School Home Work Project

[![size](https://img.shields.io/github/repo-size/MaxKonduryan/JDS-home-work)](https://github.com/MaxKonduryan/JDS-home-work)
[![lgs](https://img.shields.io/github/languages/top/MaxKonduryan/JDS-home-work)](https://github.com/MaxKonduryan/JDS-home-work)
[![java](https://img.shields.io/badge/java-1.8-blue.svg)](https://github.com/MaxKonduryan/JDS-home-work)
[![opr](https://img.shields.io/github/issues-pr-raw/MaxKonduryan/JDS-home-work?color=red)](https://github.com/MaxKonduryan/JDS-home-work/pulls)
[![cpr](https://img.shields.io/github/issues-pr-closed-raw/MaxKonduryan/JDS-home-work?color=blue)](https://github.com/MaxKonduryan/JDS-home-work/pulls)
[![cpr](https://img.shields.io/github/checks-status/MaxKonduryan/JDS-home-work/dev?color=blue)](https://github.com/MaxKonduryan/JDS-home-work/pulls)

* [#1 - HelloWorld](#home-work-1)
* [#2 - Calculator](#home-work-2)
* [#3 - Repository](#home-work-3)
* [#4 - Repository - File Implementation](#home-work-4)
* [#5 - Banknote & Cassette](#home-work-5)
* [#6 + 7 - AccountUtils : sortedById, sortedByIdDate](#home-work-6-and-7)
* [#8 + 9 - JSON/XML Serialization](#home-work-8-and-9)
* [#10 + 11 - AccountService : getMaxAccountBalance, getAllAccountsByDateMoreThen](#home-work-10-and-11)
* [#12 + 13 + 14 - MainReport : getTotalsWithCompletableFuture, getTotalsWithReact](#home-work-12-and-13-and-14)

---

## home work #1
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
---

## home work #2

Branch : [GitHub - RodinDenis/home-work at lesson-2](https://github.com/RodinDenis/home-work/tree/lesson-2) \
Wiki: [GitHub - RodinDenis/home-work at lesson-2](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-2.)

* Написать класс с методами
    * сложение
    * вычетание
    * умножение
    * деление

    + 3 метода на свое усмотрение
* Написать ко всем методам тесты

### Варианты работы

#### Fork

1. Сделать fork [GitHub - RodinDenis/home-work](https://github.com/RodinDenis/home-work)
2. Переключиться на ветку **develop**
3. Создать новую ветку
4. Сделать pull из ветки **lesson-2** в вашу личную ветку(у вас должен будет появиться тест)
5. Выполнить домашнее задание, выполнив условия
    1. написан класс `Calculator`
    2. проект соберется
    3. все тесты пройдены
6. Собрать проект
7. Сделать commit и push
8. Сделать pull request вашей новой ветки в ветку develop

#### Pull

1. Создать свой репозиторий на GitHub
2. Подключить локально свой репозиторий и [GitHub - RodinDenis/home-work](https://github.com/RodinDenis/home-work)
3. Создать новую ветку
4. Сделать pull из ветки **lesson-2** в вашу личную ветку(у вас должен будет появиться тест)
5. Выполнить домашнее задание, выполнив условия
    1. написан класс Calculator
    2. проект соберется
    3. все тесты пройдены
6. Собрать проект
7. Сделать commit и push
8. Сделать pull request вашей новой ветки в ветку **develop**

---

## home work #3

Branch: [GitHub - RodinDenis/home-work at lesson-3](https://github.com/RodinDenis/home-work/tree/lesson-3) \
Wiki: [GitHub - RodinDenis/home-work at lesson-3](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-3.)

### Задание

* Создать иерархию классов (на основе тестового класса `AccountServiceTest`) с простой логикой. Должны присутствовать
  Интерфейс/абстрактный класс.
* Написать тест(-ы). Использовать Mock*.
* В проекте использовать мавен и ломбок.
* Добиться успешного прохождения тестов из `AccountServiceTest`.

### С чего начать:

1. Создать свою ветку от ветки **develop**.
2. Сделать pull из ветки **lesson-3** (Появится готовый класс с тестом `AccountServiceTest`).
3. Выполнить домашнее задание.

---

## home work #4

Branch: [GitHub - RodinDenis/home-work at lesson-4](https://github.com/RodinDenis/home-work/tree/lesson-4) \
Wiki: [GitHub - RodinDenis/home-work at lesson-4](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-4.)

### ТЗ

* Создать класс `AccountRepositoryImpl` реализующий интерфейс AccountRepository с прошлого урока.
* Единственный метод для реализации `getAllAccountsByClientId`.

**Реализовать метод getAllAccountsByClientId по следующим требованиям:**

1. _Прочитать файл Accounts.txt используя `InputStream` и `BufferedReader` (возможны варианты)._
2. _Распарсить полученные строки(любым способом на ваш выбор, можно стандартными методами класса String)._
3. _Создать Set на основе данных из файла, где value = number из файла исключительно для clientId переданного на вход._

### Задание на 5+

1. Добавить в репозиторий метод обновления номера счета с входными параметрами id клиента и номер счета(который нужно
   обновить) в файле.
2. Заменить в прочитанном файле любой номер счета у клиента.

### В приложении:

* _Для чтения\записи файлов использовать классы из Java I/O_
* _Для обработки текста использовать класс или классы для работы со строками из JDK т.е. не использовать сторонние либы_

---

## home work #5

Branch: [GitHub - RodinDenis/home-work at lesson-5](https://github.com/RodinDenis/home-work/tree/lesson-5) \
Wiki: [GitHub - RodinDenis/home-work at lesson-5](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-5.)

ТЗ.

_В нижней части банкомата размещается сейф, в котором имеется несколько кассет для хранения денежных купюр. В одной
кассете могут находиться купюры одного достоинства. Как правило, банкомат загружают купюрами на 100, 500, 1000 и 5000
рублей._

1. Создать класс `Banknote`, определяющий нашу сущность - купюра.
2. Создать класс `Cassette`, определяющий нашу сущность - кассета в банкомате. (Использовать Generics).
3. Добиться успешного выполнения теста `CassetteTest`.

---

## home work #6 and #7

Branch: [GitHub - RodinDenis/home-work at lesson-7](https://github.com/RodinDenis/home-work/tree/lesson-7) \
Wiki: [GitHub - RodinDenis/home-work at lesson-7](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-7.)

_Реализовать утилиту сортировки коллекций со счетами._

Создать класс `AccountUtils` с двумя методами.

* `sortedById` - метод сортирует коллекцию со счетами по полю `id`(id счета).

* `sortedByIdDate` - метод сортирует коллекцию со счетами по полям `id`(id счета) и `createDate`(дата создания счета).
  При чем, порядок создания - от более старых к более новым.

Дополнительное задание.

* Реализовать метод сортировки по трем полям: `id`(id счета) и `createDate`(дата создания счета) и `balance`(баланс
  счёта).
* Написать к нему тест.

---

## home work #8 and #9

Branch: [GitHub - RodinDenis/home-work at lesson-9](https://github.com/RodinDenis/home-work/tree/lesson-9) \
Wiki: [GitHub - RodinDenis/home-work at lesson-9](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-9.)

_Реализовать утилиту сериализации и десериализации в json\xml классов, передаваемых между банкоматом и хостом._

---

## home work #10 and #11

Branch: [GitHub - RodinDenis/home-work at lesson-11](https://github.com/RodinDenis/home-work/tree/lesson-11) \
Wiki: [GitHub - RodinDenis/home-work at lesson-11](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-11.)

_С помощью Stream API реализуйте новые методы класса `AccountService`._

* `getMaxAccountBalance` - метод возвращает счёт с максимальным балансом.
* `getAllAccountsByDateMoreThen` - метод возвращает счета с более поздними датами создания, чем указано во входных
  параметрах.

Дополнительное задание на 5+

* Придумать собственный метод для работы со счетами используя Stream API. Написать к нему тест.

## home work #12 and #13 and #14

Wiki: [GitHub - RodinDenis/home-work at lesson-14](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-14.)

_Создайте классы:_

* `Account` c 3 полями: 
  * сумма
  * валюта
  * дата создания
* `Customer` c 3 полями:
  * возраст
  * имя
  * коллекцией Account

У каждого класса должен быть конструктор для инициализации полей и getter-ы.

_Создайте класс `MainReport` с методом `getTotalsWithCompletableFuture` и `getTotalsWithReact`, который получает на вход Stream и возвращает сумму балансов рублевых счетов открытых между 01.07.2021 и 01.08.2021 и принадлежащих клиентам в возрасте между 18 и 30._

_Решение задачи должно использовать максимально доступное количество ядер процессора._
