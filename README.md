# Desafio Neurotch
Gateway - Analista de Desenvolvimento de Sistemas I


Segue passo a passo para executar o projeto.

Passo 1: Clonar o projeto para o Intellij.

Passo 2: Via terminal acessar a pasta Docker que se encontra no repositorio do projeto.

Passo 3: Ainda no terminal executar o seguinte comando "docker-compose up -d".

Este comando é para subir o container do MySql 8 com todas as configurações necessarias para o projeto.

Observação: Precisa que o Docker esteja devidamente instalado.

Passo 4: Volte no IntelliJ e vá ate o arquivo "NeurotechApplication" e execute o projeto.

Passo 5: Vá ate o Postman e configure uma requisição GET com a seguinte url http://localhost:8080/api/cep/v1/:cep

Passo 6: Na aba Params preencha o campo Value do parametro do Path Variables e click em Send para executar a requisição.

Passo 7: Baixe o HeidiSQL ou qualquer outra ferramenta para realizar consultar no banco.

Passo 8: Configure o HeidiSQL da seguinte forma:

Host: localhost

Port: 3306

User: admin

Password: 1234

Passo 9: Após configurar o HeidiSQL para consultar a tabela cep que todos os ceps passados na requisição do postman estarão salvos no banco.
