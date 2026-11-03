Laboratorio Git — Dal primo commit alla revisione
Lavorate in tre sullo stesso repository. Ognuno usa IntelliJ per lavorare sui file e la piattaforma del repository per aprire e revisionare le pull request.

1. Clona il repository e crea il tuo branch
    1. Clona il repository in IntelliJ. Apri Main.java e avvialo per vedere il saluto iniziale.
    2. Controlla con git status che il branch corrente sia main. Aggiornalo con git pull
    3. Crea da main un branch personale chiamato consegna/nomeesercizio-cognome e spostati su quel branch.
    
2. Modifica, controlla e pubblica
    1. Cambia il saluto in Main.java in Buongiorno, sono Rossi!, usando il tuo cognome.
    2. Esegui git status e git diff. Individua il file modificato, la riga rimossa e quella aggiunta.
    3. Metti la modifica da parte in Stash. Avvia il programma e controlla che sia tornato il saluto iniziale. Recupera la bozza.
    4. Esegui git add -- Main.java e git diff --staged. Per provare il recupero di un errore locale, togli il file dallo staging con git restore --staged -- Main.java. Controlla che il saluto personalizzato sia ancora nell’editor, poi fai nuovamente git add -- Main.java.
    5. Crea il commit feat: personalizza il saluto e pubblica il branch con Push.
    
3. Riconosci un file non tracciato e ignoralo
    1. Crea nella radice del progetto appunti-rossi.txt. Se IntelliJ propone di aggiungerlo a Git, rifiuta. Esegui git status --short e cerca ?? accanto al file.
    2. Dal browser, sul tuo branch, aggiungi /appunti-rossi.txt a .gitignore. Registra il commit chore: ignora gli appunti locali.
    3. In IntelliJ, sempre sul tuo branch, esegui git pull --ff-only. Con git status --short --ignored, verifica che appunti-rossi.txt compaia con !!. Il file è ancora sul computer.
    
4. Apri la PR e fai la revisione a giro
    1. Apri una PR con base main e sorgente il tuo branch. Nella descrizione scrivi cosa hai modificato e quale saluto hai verificato.
    2. Quando tutte e tre le PR sono aperte, apri quella di un collega. In Files changed, lascia un commento inline sulla riga del saluto e chiedi di aggiungere Benvenuti al laboratorio Git.
    3. Sulla tua PR, applica la modifica ricevuta. Avvia il programma, fai un nuovo commit feat: aggiunge il benvenuto e pubblicalo sullo stesso branch. Rispondi al commento indicando cosa stampa ora.
    4. Per simulare una review di codice prodotto con l’AI, confronta questa proposta con il requisito «Senza argomenti il programma deve stampare Buongiorno, ospite!».
       System.out.println("Buongiorno, " + args[0].trim() + "!");
       Provala in IntelliJ senza argomenti su un branch locale temporaneo creato dal tuo. Registra l’esito in un commento sulla tua PR, indicando il risultato atteso, l’errore ottenuto e il controllo che aggiungeresti prima di leggere args[0]. Poi torna sul tuo. Tieni la prova fuori dalla PR.
       
5. Prova cherry-pick, conflitto, merge e revert
    1. Prepara due commit. Dal tuo branch crea demo/rossi-sorgente. Nel primo commit aggiungi nota-utile.txt con un promemoria su Git. Nel secondo cambia la riga del saluto in Saluto dal branch sorgente.
    2. Cherry-pick. Torna sul tuo branch e crea da lì demo/rossi-integrazione. Nel Git Log di IntelliJ fai clic destro sul commit che aggiunge nota-utile.txt e scegli Cherry-Pick. Controlla che sia arrivata la nota e che il saluto sia ancora quello della tua PR.
    3. Conflitto e merge. Su demo/rossi-integrazione, cambia la stessa riga del saluto in Saluto dal branch di integrazione. e fai commit. Restando su demo/rossi-integrazione, usa il menu dei branch per fare il merge di demo/rossi-sorgente nel branch corrente. Quando IntelliJ segnala il conflitto, apri il risolutore, scegli come frase finale Saluto dopo il merge. e completa il merge. Avvia Main.java per verificare.
    4. Revert di un commit pubblicato. Su demo/rossi-integrazione, aggiungi un secondo println con il testo Il corso è annullato.. Fai un commit dedicato e pubblica il branch. Poi, nel Git Log, fai clic destro sul commit dell’avviso e scegli Revert Commit. Completa il commit di revert e fai di nuovo push. Avvia il programma e verifica che stampi solo il saluto. Nella cronologia devono essere visibili sia il commit dell’avviso sia quello che lo annulla.

    
Consegna
Invia il link alla tua PR aperta verso main e indica il nome del branch che hai pubblicato.
Nella PR devono essere visibili il saluto finale, la regola di .gitignore, il commento inline ricevuto, la tua risposta e l’esito della prova di review del codice AI. Sul branch di integrazione devono essere visibili il cherry-pick, il merge e il revert.
