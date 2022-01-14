4. Nämn två olika design pattern och förklara hur ett av dessa fungerar samt vad det kan vara bra för.
---
Factory och Builder är två olika designmönster. Factory-mönstret säger att man bara definierar ett interface eller en
abstrakt klass för att skapa ett objekt, men låter underklasserna bestämma vilken klass som ska instansieras.
Med andra ord är underklasser ansvariga för att skapa instansen av klassen.

<h3>Varför använda sig utav factory-mönstret?</h3>
 
- Factory-Method-mönstret låter underklasserna välja vilken typ av objekt som ska skapas.
- Det främjar den lösa kopplingen genom att eliminera behovet av att binda applikationsspecifika klasser i koden. 
Det betyder att koden enbart interagerar med det resulterande interfacet eller den abstrakta klassen
så att den fungerar med alla klasser som implementerar det interfacet eller som utökar den abstrakta klassen.
