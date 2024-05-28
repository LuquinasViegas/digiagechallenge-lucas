## Challenge Digiage

 Este é um desafio da [Coodesh](https://coodesh.com/)

## Um Pouco Sobre Mim

 - Me chamo Lucas Viegas Dias.
 - Tenho 21 anos.
 - Faço Faculdade de Jogos Digitais na Estacio desde 01/01/2024
 - Meu [Github](https://github.com/LuquinasViegas)

 Em 2017, conclui um curso de Desenvolvedor de Jogos, onde minha paixão pela área de Tecnologia da Informação se iniciou. Em seguida, iniciei minha experiência no
  mercado de trabalho em uma fábrica de tecelagem. 
 Em 2021, fui chamado para o exército para servir durante meu ano obrigatório, foi onde adquiri muitas experiências de vida, como uma nova educação, trabalho em
  equipe, comprometimento, responsabilidade. Após o término do ano obrigatório do exército, entrei em uma loja de estofados onde trabalho atualmente, na área de
  vendas.
 Mas não era isso que eu queria para mim, não senti paixão fazendo isso, senti como uma obrigação para estar lá para pagar contas, para mim não está certo viver 
  Fazendo algo que não gosta ou não te dê motivação, me lembrei do ano em que estava desenvolvendo no curso de jogos, onde eu gostei de programar por horas, por mais
  desafiador que seja, é algo que eu gosto. Então, iniciei minha faculdade e procurei um curso que me interesasse, escolhi Jogos Digitais para mim, foi a escolha certa, consigo ter um passatempo para um dia, fazer um jogo indie, e também encontrar um emprego na área de programação.
 Sou uma pessoa reservada e às vezes me passo por tímido. Quando estou em casa, gosto de ter a minha privacidade, estudando, jogando, programando ou até mesmo
  assistindo. Sou focado naquilo que me motiva e não desisto até conseguir. Às vezes sou um pouco inquieto, um pouco agitado, um pouco ansioso, mas sempre com
  pensamentos positivos e acredito que o que é para dar certo, vai dar certo!
 Mas também quando tem algum assunto que me envolve, eu me solto facilmente.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## SQL
 Para dar inicio ao projeto do banco de dados fiz o download do sql workbench.
 - download [MySQLWorkbench](https://cdn.mysql.com//Downloads/MySQLGUITools/mysql-workbench-community-8.0.36-winx64.msi)
 Fiz o login com o banco de dados.
 SQL com banco de dados foi algo novo no qual eu não conhecia, fui aprendendo enquanto fazia o programação

 ### 1. Separação Por Genero.
 Count (*) para a contagem de funcionarios, e no grupo de generos fiz a separação para saber quantos funcionarios "M" e "F" separando por generos.

 ### 2. Quantidade De Funcionario Por Gênero, Ano e Aniversario.
 Count (*) para a contagem de funcionarios, e sera feita a separação por gênero ano e aniversario do funcionario, o codigó esta dando erro por excesso de tempo de execução, como ainda não conheço muito sobre SQl não consegui resolver esse detalhe, mas fazendo a separação de cada uma das categorias da tabela com o mesmo codigo ele me apresenta sem erros o a quantidade de funcionarios, ano e aniversario.

 ### 3. Media Salarial, Valor Max e Min Separado Por Gênero.
 Selecionei o maior e menor salario separada por gênero, e a media de salario separado por gênero, usei LEFT JOIN para juntar as duas tabelas de salarios e funcionarios


 - [Video](https://drive.google.com/file/d/1HS85wvUScABvsSHe-utMaj7rgP-Pc2GE/view?usp=sharing)rodando o código.
 - Arquivo do código [SQL](https://drive.google.com/file/d/1Q3dsS9GVYCCXzIBP3GXLAW9aZoDEQljy/view?usp=sharing)

## Analise do Grafico
- Memoria/CPU - O pico máximo de byte pela memória foi de 20B, já o mínimo foi de 5B. Na memória, teve um uso máximo de 21.6% e um uso mínimo de 12.8%.

- Logins - no login teve um pico mínimo de 0 logins das 15:26:00 até 15:32:00, onde provavelmente o site foi desligado para manutenção ou caiu, seguindo a mesma lógica registrada no site há 1 hora, a previsão para os próximos 20minutos é de que ele terá um pico máximo de 32 logins às 15:34:40 e 15:35:10.

- Server Requests - Há 4 web_servers para as requisições necessárias para o site. As 15:14:30 tiveram seu pico máximo de requisições, sendo:
 30.8 para o web_server_1
 25.5 para o web_server_2
 25.8 para o web_server_3
 25.9 para o web_server_4
 o web_server_1 teve a queda no mesmo horário de manutenção do site e os outros webservers aumentaram a demanda de requisições, tendo o maior pico de requisições.
 32.8 para o web_server_2
 33.2 para o web_server_3
 32.8 para o web_server_4

- Memory - o uso de memória está "estável" ficando em 95.5B

- Google Hits - todo o registo de hits está "estável" ficando em 47.7 com folga para chegar a margem amarela de "alerta"

- Support calls - teve uma alta demanda de chamada de suporte, com seu máximo sendo 81.8

- Sign ups - teve uma média ótima e estável de inscrições, com somente uma queda, porém um total de 266 inscrições.

- Google hits series - há 5 series, sendo elas: A, B, C, D, E cada uma para uma função de interação com o site.
 A-series tiveram razoáveis interações, com seu máximo de 55.0 hits.
 B-series teve baixas interações, com seu máximo de 28.0 hits.
 C-series teve baixas interações, com seu máximo de 21.8 hits.
 D-series teve altas interações, com seu máximo de 84.2 hits.
 E-series tiveram razoáveis interações, com seu máximo de 48.3 hits.

 Azul: Uso baixo
 verde: Uso razoável
 amarelo: Uso médio-alto
 vermelho: Uso alto



> link [fotografico](https://drive.google.com/file/d/19RhW1JYBECiiPOjbbX90jmGvkEJ-rzuN/view?usp=sharing)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Palindromo. 
 Para a task1, criei um texto para que a pessoa que rodar o código aparacesse uma mensagem para digitar uma palavra, chama consequentemente a função scan para a pessoa digitar a palavra, a palavra digitada ira passar por um teste onde ira inverter a mesma e vai verificar se ela pode ser lida de trás para frente e continuar sendo lida igualmente, em seguida apresenta o texto me dizendo se é ou não um palíndromo.

- import java.util.Scanner;

> Link [task1](https://drive.google.com/file/d/1sQOcQMHo4_L9kfM2Jzl7gy6963g39QLe/view?usp=sharing)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Lista de Elementos
 Para a task2, procurei uma forma de criar uma lista que fosse capaz do valor atual saber o próximo elemento e anterior a ele, achei o linkedlist que foi eficaz, criei uma lista de 11 elementos vai me imprimir todos os elementos, fara a divisão total de elementos por 2 para descobrir o elemento que esta no meio e removera ele pelo índice.

- import java.util.LinkedList;

> link [task2](https://drive.google.com/file/d/1j_izibfV8Oxp680NpxTdDNphlbVAH1RZ/view?usp=sharing)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Criação de lista e contagem 
 Já na task3, criei uma variável denominada distintos, criei uma array de string, chamei a função scan novamente igual a task1 para quem rodar o código, apareça uma mensagem para digitar uma string, criei a função para a string digitada ser armazenada como "string de entrada" e este valor armazenado seria colocado na array, e chamaria a scan novamente perguntando se o usuário gostaria de digitar outra string, o programa se encerra caso o usuário não queira mais digitar nenhuma string, caso o usuário resolva digitar outra string criei a função que verifica se a string que ele digitou for diferente de uma string já existente na array ele iria somar +1 na lista de distintos, já se for igual aparecera na lista, porém não será somada em distintos.
 Encerrando o código ele me imprime o resultado do array e a quantidade de distintos.

- import java.util.ArrayList;
- import java.util.Scanner;

> link [task3](https://drive.google.com/file/d/1dbjtko8G03j-zlfN83rMKGiNzUeINH6F/view?usp=sharing)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Separação de generos 
 Na task4 tive bastante dificuldade em encontrar uma forma de conseguir acessar um link e fazer um scrapping de um dado específico na página. 
 Muito tempo procurando, achei o JSon, tive dificuldade para fazer a instalação somente com a pasta e achei melhor fazer manualmente pelo Vscode, fiz a instalação dele no Vscode.

 Instalação manual do Json no Vscode
 . No canto esquerdo inferior em JAVA PROJECTS vai haver uma aba com o nome "Maven Dependencies".
 . À Direita do Maven Dependencies terá um "+" add a dependency clique la.
 . No centro superior do Vscode aparecerá uma aba para digitar a dependência que quer instalar.
 . Digite Json e de um enter.
 . Vai aparecer a dependência Json.org, clique nela.
 . Abrirá uma nova aba da dependência, de um Ctrl+S para salvar e começará a fazer download da extensão Json.

 Depois da instalação do Json comecei a declarar a url e o bucket da aws, fiz o tratamento do erro de abertura da url para que contornasse o erro, fiz a criação
  requisição da busca pela url e implementei o código para fazer a separação por gênero "M" e "F", verificar gênero por gênero e adiciona +1 para cada gênero que encontrasse em cada pessoa.
 Próximo passo era criar um documento que me mostrava o resultado do Scrapping que fiz, vai criar um documento na pasta inicial do projeto que vai conter as
  informações de cada genero.
 Coloquei as credenciais de keys e adicionei-as no gitgnore para não serem upadas no github.
 E coloquei no código as credenciais para ter acesso à aws.
 Tive que fazer a instalação da dependência da AmazonAWS da mesma forma que fiz a do Json.

 Instalação manual do AmazonAws no Vscode.
 . No canto esquerdo inferior em JAVA PROJECTS vai haver uma aba com o nome "Maven Dependencies".
 . À Direita do Maven Dependencies terá um "+" add a dependency clique la.
 . No centro superior do Vscode aparecerá uma aba para digitar a dependência que quer instalar.
 . Digite aws e de um enter.
 . Vai aparecer a dependencia aws-java-sdk, clique nela.
 . Abrirá uma nova aba da dependência, de um Ctrl+S para salvar e começará a fazer download da extensão AmazonAws.

 Com o acesso com a AmazonAWS fiz um código que mandasse o arquivo com os registos do resultado da separação de gênero para o BUCKET, foi necessário instalar a dependência jaxb-api.

 Instalação manual do jaxb-api no Vscode.
 . No canto esquerdo inferior em JAVA PROJECTS vai haver uma aba com o nome "Maven Dependencies".
 . À Direita do Maven Dependencies terá um "+" add a dependency clique la.
 . No centro superior do Vscode aparecerá uma aba para digitar a dependência que quer instalar.
 . Digite jaxb-api e de um enter.
 . Vai aparecer a dependencia jaxb-api, clique nela.
 . Abrirá uma nova aba da dependência, de um Ctrl+S para salvar e começará a fazer download da extensão jaxb-api.

- import java.io.IOException;
- import java.io.PrintWriter;
- import java.net.URI;
- import java.net.http.HttpClient;
- import java.net.http.HttpRequest;
- import java.net.http.HttpResponse;
- import java.net.http.HttpResponse.BodyHandlers;
- import java.util.regex.Matcher;
- import java.util.regex.Pattern;

- import com.amazonaws.auth.AWSStaticCredentialsProvider;
- import com.amazonaws.auth.BasicAWSCredentials;
- import com.amazonaws.regions.Regions;
- import com.amazonaws.services.s3.AmazonS3;
- import com.amazonaws.services.s3.AmazonS3ClientBuilder;
- import com.credenciais.Credenciais;

> link [task4](https://drive.google.com/file/d/1RNvc1JGqQyI1c_3_Y-IoxzaYDdQwX8Yi/view?usp=sharing)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Implmentação de API
 Não tinha conhecimento sobre como criar uma API e usar CRUD, comecei a estudar sobre o Spring Boot, porém não me havia mais tempo para terminar, adquirir os conhecimentos necessários e fazer a programação a tempo do prazo de entrega, por isso não concluí a task 5.
 Ainda continuo os estudos para um dia ser capaz de fazer essa task.