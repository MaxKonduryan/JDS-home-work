# Java Developer School Home Work Project

Home works

* [#1 - HelloWorld](#home-work-1)
* [#2 - Calculator](#home-work-2)
* [#3 - Repository](#home-work-3)
* [#4 - Repository - File Implementation](#home-work-4)
* [#5 - Banknote & Cassette](#home-work-5)

---

## home work #1

    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }

---

## home work #2

Branch : [GitHub - RodinDenis/home-work at lesson-2](https://github.com/RodinDenis/home-work/tree/lesson-2)

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

Branch: [GitHub - RodinDenis/home-work at lesson-3](https://github.com/RodinDenis/home-work/tree/lesson-3)

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

Branch: [GitHub - RodinDenis/home-work at lesson-4](https://github.com/RodinDenis/home-work/tree/lesson-4)

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

ТЗ.

_В нижней части банкомата размещается сейф, в котором имеется несколько кассет для хранения денежных купюр. В одной
кассете могут находиться купюры одного достоинства. Как правило, банкомат загружают купюрами на 100, 500, 1000 и 5000
рублей._

1. Создать класс `Banknote`, определяющий нашу сущность - купюра.
2. Создать класс `Cassette`, определяющий нашу сущность - кассета в банкомате. (Использовать Generics).
3. Добиться успешного выполнения теста `CassetteTest`.