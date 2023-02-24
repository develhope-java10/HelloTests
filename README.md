# Esercizio 1

Isolate la logica attualmente riportata nel Main, ovvero quella di prendere una sequenza di coppie di stringhe, fare il parsing e dividerle come interi, in una nuova classe "BatchDivision"

Questa classe prende in input una collection (array o lista) di String strutturate in questo modo: "DIVIDENDO,DIVISORE". Implementare un metodo result () che effettui la conversione con successiva divisione per ogni stringa e ritorni come risultato in una collezione di double con dentro i quozienti. 
In caso di eccezione durante il processamento di una riga, il risultato non verra inserito in lista ed il metodo proseguirà con la riga successiva.

Nel Main caricare la lista di righe da file e processarla usando un oggetto di tipo BatchDivision. Scrivere la lista di quozienti, riga per riga, in un nuovo file di testo.

Scrivere unit test per BatchDivision.

ESEMPIO: Se nel file di input sono presenti le seguenti righe:

```
6,3
5,2
10,0
-4,1
```

Il file di output deve contenere:

```
2.0
2.5
-4.0
```
