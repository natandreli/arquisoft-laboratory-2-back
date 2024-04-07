# arquisoft-laboratory-2-back

[![CI/CD Pipeline](https://github.com/natandreli/arquisoft-laboratory-2-back/actions/workflows/build.yml/badge.svg)](https://github.com/natandreli/arquisoft-laboratory-2-back/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=bugs)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=coverage)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=natandreli_arquisoft-laboratory-2-back&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=natandreli_arquisoft-laboratory-2-back)

Implementation of a Simple App with the next operations:

* Get random nations

* Get random currencies

* Get random aviation

* Get application version

* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```

to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```