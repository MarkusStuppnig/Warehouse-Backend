# Warehouse

## Backend

### Spring Boot

* Application erstellen mit dem Spring Boot Initializer
* Methodik zum Controller adden, welche auf 2 unterschiedliche routen antwortet:
/warehouse/{inID}/data
/warehouse/{inID}/xml

* Content-Type setzen fuer die RequestMappings
produces = MediaType.APPLICATION_JSON_VALUE
produces = MediaType.APPLICATION_XML_VALUE

* getWarehouseData() callen, sodass ein WareHouse Objekt returned wird, dieses wird automatisch zu json oder xml uebersetzt
* Folgende dependencies in die build.gradle adden
implementation 'org.springframework.boot:spring-boot-starter-data-rest'
implementation 'org.springframework.boot:spring-boot-starter-web'
implementation 'com.fasterxml.jackson.dataformat:jackson-dataformat-xml'
testImplementation 'org.springframework.boot:spring-boot-starter-test'

* Random Methodik mit Arrays und random Werten umsetzen, sodass ein neues random Warehouse objekt mit Random produkten erstellt wird
* `gradle clean runBoot` executen

### Frontend

* React projekt erstellen mit `npx create-react-app my-app`
* Table component (file) erstellen
* axios installieren mit npm install axios
* methode zum table component adden, welche mit hilfe von axios eine request an spring boot macht (json)
* die response mithilfe von useState setter setzen in die variablen von react
* useEffect nutzen, um die methode aufzurufen, sowie einen html button adden, welcher onclick die methode aufruft
* den table component zu app.js adden
* cors error entfernen, indem folgende line ueber die requestmappings in spring boot geschrieben wird `@CrossOrigin(origins = "http://localhost:3000")`
* npm run build
* npm run start