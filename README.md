# Fundamentals test oefening 4

Een van de vele mogelijke oplossingen voor de laatste oefeningen op fundamentals test.
Deze oplossing is klassikaal gemaakt met de aanwezigen in Kontich.

Beginnende met een abstracte Account klasse laten we de zichtrekening en de spaarrekening hiervan overerven.

Een aantal operaties zijn gelijk voor de checkings en savings account. 
Die definiëren we dus in de abstracte account klasse.

Een savings account kan enkel bestaan als extensie van een checkings account. We geven de constructor van de checkings
 account een savings account mee. 
 We linken echter de checkings aan de savings en omgekeerd door ze als instance variabelen te definiëren in de twee klassen.

Om random rekeningnummers te genereren hebben we gebruik gemaakt van de [**Apache Commons lang3**](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3) dependency. 
We trekken deze binnen door middel van Maven. Na [research](https://www.baeldung.com/java-random-string) over hoe random strings te genereren vonden we dat mensen hier al over hadden nagedacht. 
Deze code kan handig hergebruikt worden door een dependency toe te voegen en de benodigde klassen en methodes hiervan te gebruiken.

    
    <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.9</version>
        </dependency>
    </dependencies>

