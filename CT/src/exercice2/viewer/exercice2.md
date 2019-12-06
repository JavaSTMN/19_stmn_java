# Exercice 2

## Question 3
Il n'est pas possible d'utiliser le code de la classse TreeViewer avec la classe Node car, dans la classe TreeViewer les node ne sont pas des Node mais des Object.

## Question 4
Pour pouvoir utiliser le code de TreeViewer avec la classe Node, il faudrait dans le code de TreeViewer remplacer les Object node, parent par des Node.

## Question 8
Pour décrire un object Node, on pourrait utiliser le format JSON suivant : 
```json
{
    "name" : "root",
    "children" : 
    [
        {
            "name" : "parent 1, first child of root",
            "children" : 
            [
                {
                    "name" : "child of parent 1",
                    "children" : []
                }
            ]
        }, 
        {
            "name" : "second child of root",
            "children" : []
        }
    ]
}
```

