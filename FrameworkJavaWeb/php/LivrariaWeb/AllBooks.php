<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <a href="AllBooks.php"><b>Listar</b></a>
        &nbsp;
        <a href="SearchBook.html"><b>Pesquisar</b></a>
        &nbsp;
        <a href="RegisterBook.html"><b>Cadastrar</b></a>
        &nbsp;
        <a href="DeleteBook.html"><b>Excluir</b></a>
        &nbsp;
        <hr></hr>
        <?php
            $servidor = 'localhost';
            $banco      = 'livraria';
            $usuario  = 'root';
            $senha    = 'root';
            $link     = mysqli_connect($servidor,$usuario);
            $db       = mysqli_select_db($link,$banco);
            $SQL = "SELECT * FROM livraria.livros;";
            $RS  = mysqli_query($link,$SQL);
            if (mysqli_num_rows($RS) == 0) { 
                  echo "Nenhum livro cadastrado!";//results are empty, do something here 
                }
            else{
                echo "<br><table border='1'>";
                echo "<tr><td><b>Cod</b></td><td><b>Titulo</b></td><td><b>Autor</b></td><td><b>ISBN</b></td><td><b>Valor</b></td><tr>";
                while($RF = mysqli_fetch_array($RS))
                {
                    echo "<tr><td>".$RF['idlivros']."</td><td>".$RF['titulo']."</td><td>".$RF['autor']."</td><td>".$RF['ISBN']."</td><td>R$ ".$RF['valor']."</td></tr>";
                }
                echo "</table>";
            }
        ?>
    </body>
</html>
