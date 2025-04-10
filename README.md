# Compte-rendu TP2 Introduction GIT

## Partie 1

Trois commande qui vont être importante pour la suite :

- `git remote`  :

    cette commande sert à gérer (ajouter) des dépôts distants (“remotes”). En d’autres termes, nous utiliserons cette commande pour créer un lien entre notre dépôt local  `tp1`  et celui distant que nous allons créer dans github.

- `git push`  :

    cette commande permet de mettre à jour le dépôt distant (e.g. github) à partir de la dernière version validée (_commit)_  de notre dépôt local.

- `git pull`  :

    cette commande sert à mettre à jour notre dépot local à partir de la dernière version de notre dépôt distant.
Après avoir fait l'introduction, j'ai réussis à synchroniser le dépôt local et distant.

### Exercice

Nous devons modifier le fichier `Cryptomonnaie.java` puis le mettre sur le dépôt distant.
Nous devons suivre dans l'ordre suivant ces étape :

 1. `git pull` pour synchroniser les deux dépôts
 2. On modifie le programme `Cryptomonnaie.java`
 3. `git add Cryptomonnaie.java`
 4. `git commit -m "Ajout de getters et setters"`
 5. `git push`pour envoyer le contenu du dépôt local sur le dépôt distant
Après avoir fait cela, nous pouvons constater qu'il y a bien eu un changement au niveau du programme `Cryptomonnaie.java`

## Partie 2

L'ancienne méthode pour synchroniser et très complexe et il existe une méthode bien plus simple : le clone.
Nous avons bien créer un nouveau repo puis nous avons récupérer le lien ssh.
La commande est la suivante : `git clone [lien ssh]`  
