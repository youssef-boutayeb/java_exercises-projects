Contexte

#### 1/Une ~~médiathèque~~ de quartier prête des ~~livres~~ et des <i>~~DVD~~</i>. Chaque ~~document~~ a une cote, un titre et une année de parution. Un livre a aussi un auteur et un nombre de pages. Un DVD a un réalisateur et une durée en minutes. Les adhérents ont un numéro, un nom et une ~~adresse~~ (rue, ville, code postal). ~~Un adhérent~~ peut emprunter jusqu'à 3 documents à la fois. On veut savoir si un document est **disponible**, pouvoir l'**emprunter**, **le rendre**, et ***afficher*** la liste des emprunts d'un adhérent.



### 2/LES CLASSES AVEC LEURS ATTRIBUTS

Document

\----------------------------

\- cote : String

\- titre : String

\- anneeParution : int

\----------------------------

\+ estDisponible() : boolean





Livre

\----------------------------

\- auteur : String

\- nombrePages : int

\----------------------------





DVD

\----------------------------

\- realisateur : String

\- duree : int

\----------------------------





Adresse

\----------------------------

\- rue : String

\- ville : String

\- codePostal : String

\----------------------------





Adherent

\----------------------------

\- numero : int

\- nom : String

\- adresse : Adresse

\----------------------------

\+ emprunter(d : Document) : boolean

\+ rendre(d : Document) : void

\+ afficherEmprunts() : void





### **3/ DIFF ENTRE UN est un ET a un**



##### 

##### **Si tu peux dire « est un » → Héritage**



##### **Si tu peux dire « a un » → Association**







### 

### **4/**

### 

### **On place dans la classe parente les attributs et les méthodes communs à toutes les classes filles.**



**POUR:**

**- D'éviter la répétition du code.**

**- De faciliter la maintenance.**

**- De favoriser la réutilisation du code.**

**- De regrouper les caractéristiques communes.**

**Les attributs et les méthodes spécifiques restent dans les classes filles.**





### **5/**

&#x20;             **+----------------------+**

&#x20;             **|        Animal        |**

&#x20;             **+----------------------+**

&#x20;             **|                      |**

&#x20;             **+----------------------+**

&#x20;             **|                      |**

&#x20;             **+----------------------+**

&#x20;                   **△          △**

&#x20;                   **|          |**

&#x20;         **\_\_\_\_\_\_\_\_\_\_|          |\_\_\_\_\_\_\_\_\_\_**

&#x20;         **|                              |**

&#x20;         **|                              |**

**+----------------------+      +----------------------+**

**|        Chien         |      |         Chat         |**

**+----------------------+      +----------------------+**

**|                      |      |                      |**

**+----------------------+      +----------------------+**

**|                      |      |                      |**

**+----------------------+      +----------------------+**

### 

**6/**

### **Question de réflexion:**

**Le nombre maximal d'emprunts doit être un attribut d'instance (maxEmprunts) de la classe Adherent, car il peut varier d'un adhérent à un autre. Cela rend le système plus flexible et facilite l'ajout de nouvelles catégories d'adhérents.**

