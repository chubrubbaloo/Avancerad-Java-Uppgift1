1.	Beskriv vad Stream är för något och vad kan det vara bra för.
---
Stream APIn som introduceras i Java 8 används för att bearbeta samlingar av objekt.
En stream är en sekvens av objekt som stöder olika metoder som kan ”pipelineas” för att ge önskat resultat.
Vi kan korta ner koden, öka läsbarhetern och undvika buggar p.g.a. misstag i detaljerna.

•	En stream är INTE en datastruktur, istället tar den input från samlingar, arrayer eller I/O-kanaler.

•	Stream ändrar inte den ursprungliga datastrukturen, de ger bara resultatet enligt pipelinemetoderna.

•	Varje mellanliggande operation utförs lätt och returnerar en stream som ett resultat, därför kan olika mellanliggande operationer ”pipelineas”.
Terminaloperationer markerar slutet på streamen och returnerar resultatet.


Olika operationer när det kommer till Stream:

- Intermediate operations -  t.ex. filter, sort, map - sänder vidare resultatet i stream-format.
- Terminal operations avslutar strömmen - t.ex. toList, forEach, sum, reduce.

