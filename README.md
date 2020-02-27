# Java Framework for Web Automated Test 

## Description

Framework to develop web automated test

## Pré-requisitos

- Java 1.8+

## Estrutura de pastas 

Project Source Three :
```
├── src
│   ├── main
│   │   └── java
│   │   └── resources
│   ├── test
│   │   ├── java
│   │   │  └── elementPage
│   │   │  └── page
│   │   │  └── step
│   │   │  └── utils
│   │   │  │    └── environment
│   │   │  │    └── fileReader
│   │   │  │    └── report
│   │   ├── resources
│   │   │  └── features
│   │   │  └── img
├── target
├── pom.xml
├── README.md


```

## Execute Test

1. Build the project with maven configuration 
2. To execute the test, just Run LocalTest to see example project running.

## Tips Screenshot

If you would like to take a screenshot during the test, we have some methods to do that. In the reports folder, there is a class with the name ```TakeScreenshot.java``` and in side have this methods: 

- ### To take screenshot of all page. 
```
    takeSnapShot() 
```
![bluer](src\test\resources\readme\fullscreenshot.png)

- ### Title in the image
```
    imageWithTitle(WebElement element, String title)
```
![bluer](src\test\resources\readme\title.png)

- ### To blur the element use the method. 
```
    blurTheElement(WebElement element)
```
![bluer](src\test\resources\readme\blur.png)

- ### High Light element 
```
    highlightTheElement(WebElement element)
```
![bluer](src\test\resources\readme\highlith.png)

- ### High Light element with text
```
    highlightWithText(WebElement element, String text)
```
![bluer](src\test\resources\readme\highlithwithtext.png)


## Envolve

Priscila de Araujo Caimi - paraujocaimi@gmail.com

