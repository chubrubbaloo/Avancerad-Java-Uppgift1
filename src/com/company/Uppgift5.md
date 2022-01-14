5. Beskriv (kortfattat och översiktligt) vad reguljära uttryck / regex är för något? 
---
Reguljära uttryck eller regex är ett API som definierar ett mönster för sökning eller manipulering av strängar. 
Det används allmänt för att definiera begränsningen på strängar för t ex lösenord och mail validation. Java Regex APIn
förser ett interface och 3 klasser i java.util.regex paketet. Detta paketet förser funktionerna för Javas reguljära uttryck.

Matcher och Pattern-klasserna ger möjligheten till Javas reguljära uttryck.
Paketet java.util.regex tillhandahåller följande klasser och gränssnitt för reguljära uttryck:
- MatchResult interface 
- Matcher-klassen 
- Pattern-klassen
- PatternSyntaxException-klassen

<h3>Matcher-klassen</h3>
Den implementerar MatchResult-interfacet. Det är en regexmotor som används för att utföra matchningsoperationer på en teckensekvens.

<h3>Pattern-klassen</h3>
Det är den kompilerade versionen av ett reguljärt uttryck. Den används för att definiera ett mönster för regexmotorn.