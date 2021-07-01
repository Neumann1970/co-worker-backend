1. Добавление данных сотрудника в базу данных со следующими реквизитами (ФИО, табельный номер, дата приема, дата увольнения, зарплата)


POST http://localhost:8081/api/employees

Body:
{
    "fullName": "Andrey Pashkov",
    "joinedDate": "2021-02-01",
    "dismissed": null,
    "salary": 100000.0
}

2. Обновление данных сотрудника

PUT http://localhost:8081/api/employees/{id}

Body:
{
    "fullName": "Andrey Pashkov",
    "joinedDate": "2020-02-01",
    "dismissed": null,
    "salary": 110000.0
}

3. Получение данных сотрудника по табельному номеру

GET http://localhost:8081/api/searchEmployee/a76e3e65-fcd2-4e9e-a279-6373c2db6455



4. Получение списка данных сотрудников по зарплате (Зарплата >= X и Зарплата <= Y)
GET http://localhost:8081/api/salary?from=40000&to=90000


-------------------------------

application.properties

spring.datasource.url=jdbc:postgresql://192.168.99.100:5432/work
spring.datasource.username=postgres
spring.datasource.password=example

docker с postgres:
https://hub.docker.com/r/neumann1982/postgres