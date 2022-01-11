1.	Beskriv vad Stream är för något och vad kan det vara bra för.

Stream APIn som introduceras i Java 8 används för att bearbeta samlingar av objekt.
En stream är en sekvens av objekt som stöder olika metoder som kan ”pipelineas” för att ge önskat resultat. Vi kan korta ner kod avsevärt på detta sättet.

•	En stream är INTE en datastruktur, istället tar den input från samlingar, arrayer eller I/O-kanaler.

•	Stream ändrar inte den ursprungliga datastrukturen, de ger bara resultatet enligt pipelinemetoderna.

•	Varje mellanliggande operation utförs lätt och returnerar en stream som ett resultat, därför kan olika mellanliggande operationer ”pipelineas”.
Terminaloperationer markerar slutet på streamen och returnerar resultatet.


Olika operationer när det kommer till Stream:

•	Map: Map-metoden används för att returnera en stream som innehåller resultatet av att appplicera den angivna funktionen till elementen i denna streamen.

•	Filter: filter-metoden används för att välja element enligt predikatet som angavs som argument.

•	Sorted; sorted-metoden används för att sortera streamen.

•	Collect: collect-metoden används för att returnera resultatet av mellanliggande operationen som utfördes i streamen.

•	forEeach: forEach-metoden används för att iterera genom varje element av streamen.

•	Reduce: reduce-metoden används för att reducera elementen av streamen till ett enda värde.
