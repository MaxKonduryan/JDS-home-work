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
* [#15 - Hello Counter](#home-work-15)
* [#16 - Context](#home-work-16)
* [#17 - Minimal clent/server domain models](#home-work-17)
* [#18 - Hello Thymeleaf Controller](#home-work-18)

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

Wiki: [GitHub - RodinDenis/home-work at lesson-14](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-14)

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

## home work #15

Wiki: [GitHub - RodinDenis/home-work at lesson-15](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-15)

_Напишите сервлет, который по запросу из браузера (HTTP GET запрос) будет_

1. принимать один параметр `name`. Параметр будет передаваться в адресной строке. \
   Например: http://127.0.0.1:8080/someApp/ask?name=myName
2. в ответ будет возвращать строку "Привет, " + значение переменной `name`
3. у сервлета должно быть поле `counter` со стартовым значением 0. В нем должен происходить инкремент при каждом HTTP GET запросе. Значение каунтера также должно возвращаться после текста приветствия. \
   Например: Counter = 5

_Необходимо подобрать такой тип для поля counter чтобы обеспечить для него потокобезопасность._

_Для проверки сервлет можно деплоить в сервер приложений [Tomcat](http://tomcat.apache.org/) или любой другой, который вам понравится._

## home work #16

Wiki: [GitHub - RodinDenis/home-work at lesson-16](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-16)

_Ознакомьтесь с примером консольного приложения [SpringConsoleApp](https://github.com/RodinDenis/SpringConsoleApp)_

1. Объявите классы `Client` и `Account` Spring бинами
2. добавьте возможность инициализации этих бинов через аннотации и xml (необходимо будет явно создавать контекст)

_В реальных приложениях создание контекста скрыто "по капотом". В этом примере нужно понять как работает ядро Spring_

## home work #17

Wiki: [GitHub - RodinDenis/home-work at lesson-17](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-17)  
Repo: [GitHub - MaxKonduryan/JDS-final-project](https://github.com/MaxKonduryan/JDS-final-project)

1. Создайте новый репозиторий для финального проекта
2. Добавьте ссылку на новый репозиторий в столбец "Финальный проект"
3. Создайте новый maven проект в этом репозитории
4. Сделайте несколько maven подмодулей. Как минимум у вас будет подмодуль для клиента\банкомата и сервера.
5. В качестве задания на 5+ можете выделить 2 дополнительных maven подмодуля для хранения модели клиента\банкомата и сервера (jar).
6. Нагенерите идей объектов необходимых для моделирования получения баланса на банкомате
7. Отсейте объекты не критичные для MVP, но "не выбрасывайте" их. Отложите в условный бэклог. После построения минималистичного работоспособного приложения вы можете вернуться к этому списку и расширить модель.
8. Подумайте над атрибутами этих объектов и их методах. Аналогично пункту 7.
9. Подумайте над тем в какой последовательности будут вызываться объекта вашей модели. Процесс должен моделировать реальную ситуацию. Думая над моделью рассуждайте так как этот процесс представляют "обычные люди" знакомые с предметной областью. Старайтесь использовать их терминологию.
10. Напишите JUnit тесты, которые будут подготавливать данные для вашей модели и запускать ее. Старайтесь сначала писать тест продумывая "контракт" будущего класса, и только потом начинайте писать сам класс. Так вы в первую очередь будете задумываться о том какую цель должен достигать класс, а не то каким образом он это будет делать.
11. Создайте эти классы 
12. На этом этапе в проекте не должно быть Spring. Классы модели о Spring ничего знать не должны.

## home work #18

Wiki: [GitHub - RodinDenis/home-work at lesson-18](https://github.com/RodinDenis/home-work/wiki/%D0%A3%D1%80%D0%BE%D0%BA-18)

1. Создайте контроллер используя аннотация `@Controller`
2. Создайте в нем метод `getMessage`, который будет принимать 1 параметр name типа `String`
3. Добавьте на этот метод аннотацию для маппинга на `HHTP GET /user?name=<ваше имя>`
4. Метод `getMessage` должен возвращать имя шаблона и передавать в модель полученное имя
5. Для шаблона используйте Thymeleaf
6. В шаблоне должна возвращаться фраза "Hello " и имя полученное в запросе.