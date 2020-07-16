# Fundamentals test oefening 4

Een van de vele mogelijke oplossingen voor de laatste oefeningen op fundamentals test.
Deze oplossing is klassikaal gemaakt met de aanwezigen in Kontich.

Beginnende met een abstracte Account klasse laten we de zichtrekening en de spaarrekening hiervan overerven.

Een aantal operaties zijn gelijk voor de checkings en savings account. 
Die definiëren we dus in de abstracte account klasse.

Een savings account kan enkel bestaan als extensie van een checkings account. We geven de constructor van de checkings
 account een savings account mee. 
 We linken echter de checkings aan de savings en omgekeerd door ze als instance variabelen te definiëren in de twee klassen.
 
