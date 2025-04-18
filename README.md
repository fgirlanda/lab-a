The Knife

CONFIGURAZIONE INIZIALE:

Per utilizzare il programma è necessario configurare javaFX. Passaggi:

1) Scaricare javaFX
2) Unzippare la cartella e copiare il percorso della cartella lib
3) Per visual studio code:
    - Aprire la cartella TheKnife del progetto
    - Andare su Run -> Add Configuration...
    - Viene creato un file launch.json nella cartella .vscode, modificarlo inserendo questo codice (sostituire <javaFX_path> con il percorso copiato al passaggio 2):

        ,{
            "type": "java",
            "name": "Launch JavaFX App",
            "request": "launch",
            "mainClass": "loginfx.Login",
            "vmArgs": "--module-path <javaFX_path> --add-modules javafx.controls,javafx.fxml"
        }
    - Modificare/creare il file settings.json nella stessa cartella (.vscode)

nota: ci sono due file "settings_ex.json" e "launch_ex.json" nella cartella principale del progetto, assicurarsi che i file launch.json e settings.json seguano gli esempi

4) Per avviare il programma bisogna andare nella finestra Run & Debug (toolbar a sinistra in visual studio code) e selezionare "Launch JavaFX App" (vedi immagine sotto)

![Screenshot](Documentazione/img/istruzioni_avvio.png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

PASSAGGI PER CONTRIBUIRE:

1) git status (verificare di essere sul branch main)
2) git pull 
3) git checkout -b nome_branch (crea un nuovo branch, esempio: grafica/principale)
4) git add -A (a fine modifiche)
5) git commit -m "messaggio" (esempio: "aggiunta schermata principale")
6) git checkout main
7) git merge nome_branch

Se ci sono dei conflitti (indicati dal terminale)ç

8) Risolvere i conflitti (modificare i file in conflitto)
9) git add .
10) git commit -m "merge main-nome_branch"

11) git branch -d nome_branch (se è stato eseguito il merge correttamente, il branch viene eliminato)

nota: è meglio aprire e chiudere tanti branch uguali, facendo spesso merge, in modo da ridurre il rischio di conflitti

Per lavorare su un branch specifico già esistente:

1) git fetch origin (aggiorna i riferimenti)
2) git branch -r (restituisce una lista dei branch attualmente aperti)
3) git checkout nome_branch ("sposta" l'utente sul branch desiderato)

nota: nella lista di branch, "origin/HEAD -> origin/main" indica che il branch di default (origin/HEAD) è impostato sul branch main (origin/main)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

GRAFICA:

Font/font-size:

- label -> System 18px
- button -> System 14px
- testo mini -> System 12px

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

LOG MODIFICHE:

18-04-2025: fgirlanda -> - riorganizzazione readme + esempio.json 
                         - modifica struttura src
                         - creazione profilo_cliente.fxml nel branch grafica/profilo_cliente

19-04-2025: fgirlanda -> - modifica a file LoginController, Login, Registrazione
                         - collegamento bottone registrati -> apertura finestra registrazione
                         - creazione file TheKnife (principale)

19-04-2025: matlmbe   -> - creazione RegistazioneController
                         - assegnazione id radiobutton
                         - toggle-goup radiobutton

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Progetto di laboratorio per Università degli studi dell'Insubria, corso di Informatica, a cura di Girlanda Francesco e Lambertoni Mattia.

Il progetto è ancora in fase di progettazione, è disponibile il documento relativo, in lavorazione, scritto in Latex (formato tex)

Link per visualizzare e modificare il documento di progettazione: https://it.overleaf.com/6875229844vtytrbxfcyzc#8e5919

