# Lab14: Тооны Машины Апп

Maven-д суурилсан Spring Boot тооны машины веб аппликейшн.

## Төслийн Тодорхойлолт

Энэ төсөл нь энгийн тооны машины веб аппликейшн бөгөөд дараах үйлдлүүдийг дэмжинэ:
- Нэмэх (+)
- Хасах (-)
- Үржүүлэх (×)
- Хуваах (÷)

## Технологи

- **Java 17**
- **Spring Boot 4.0.0**
- **Maven**
- **Thymeleaf**
- **JUnit 5** (тест)
- **Checkstyle** (кодын загвар шалгалт)
- **JaCoCo** (code coverage)

## Төслийн Бүтэц

```
lab14/
├── src/
│   ├── main/
│   │   ├── java/com/lab14/lab14/
│   │   │   ├── Lab14Application.java
│   │   │   ├── CalculatorController.java
│   │   │   ├── CalculatorService.java
│   │   │   ├── Multiplication.java
│   │   │   └── Division.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           └── calculator.html
│   └── test/
│       └── java/com/lab14/lab14/
│           ├── Lab14ApplicationTests.java
│           ├── CalculatorServiceTest.java
│           ├── MultiplicationTest.java
│           └── DivisionTest.java
├── checkstyle.xml
├── pom.xml
└── README.md
```

## Суулгах болон Ажиллуулах

### Шаардлага

- Java 17 эсвэл дээш
- Maven 3.6+ эсвэл дээш

### Суулгах

```bash
# Репозитори клоно
git clone <repository-url>
cd lab14

# Maven dependencies татах
mvn clean install
```

### Ажиллуулах

```bash
# Spring Boot апп ажиллуулах
mvn spring-boot:run
```

Апп `http://localhost:8080` дээр ажиллана.

## Maven Командууд

### Тест Ажиллуулах

```bash
mvn test
```

### Checkstyle Шалгах

```bash
mvn checkstyle:check
```

### JaCoCo Coverage Тайлан Үүсгэх

```bash
mvn jacoco:report
```

Coverage тайлан `target/site/jacoco/index.html` дээр харагдана.

### Бүх Шалгалт (Checkstyle + Test + Coverage)

```bash
mvn clean test checkstyle:check jacoco:report
```

## CI/CD

Энэ төсөл GitHub Actions ашиглан автомат CI процесс агуулдаг:

- **JUnit тест**: Бүх тестүүд амжилттай гүйх ёстой
- **Checkstyle**: Код нь checkstyle.xml дүрмийг дагах ёстой
- **JaCoCo**: 100% branch coverage хангах ёстой

CI workflow файл: `.github/workflows/ci.yml`

## Git Workflow

Төсөл нь дараах Git workflow-ийг ашигладаг:

- **main**: Үндсэн салбар (production-ready код)
- **develop**: Хөгжүүлэлтийн салбар
- **feature/***: Шинэ онцлогууд
- **release/***: Хувилбар гаргах
- **hotfix/***: Яаралтай засварууд

## Branch Protection

`main` салбар нь дараах хамгаалалттай:
- Pull request шаардлагатай
- CI шалгалт амжилттай байх ёстой
- Branch шинэчлэгдсэн байх ёстой

## Хувилбарууд

- **v1.0.0**: Анхны хувилбар
- **v1.0.1**: Hotfix хувилбар

## Хувь Нэмэр Оруулах

1. `develop` салбараас шинэ `feature/*` салбар үүсгэ
2. Өөрчлөлт хий
3. Тест, Checkstyle, Coverage шалга (`mvn test checkstyle:check jacoco:report`)
4. Pull request үүсгэ
5. CI шалгалт амжилттай бол merge хий

## Зохиогч

Lab14 Төсөл

## Лиценз

MIT License

