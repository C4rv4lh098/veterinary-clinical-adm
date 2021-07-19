# veterinary-clinical-adm

1 - Integrantes:                       Matrículas:
    Raphaela Goes                      2019003109
    Rodrigo Moura de Carvalho          2019003056
    Victoria Senedesse                 2019003092
    
2 - Descrição do problema:

Os sistemas para clínicas veterinárias encontrados no mercado usam apenas um software de agendamento e notificação, não possui um sistema integrado com o laboratório bem como não apresenta um histórico posterior do paciente. Essa foi a descrição do pibic realizado em 2019, tomando-o como base refizemos com novas tecnologias visando melhor desempenho do software na parte administrativa. O software cadastra novos tutores e seus respectivos animais no banco de dados e agenda novas consultas na clínica. 

3 - O desenho da arquitetura da solução e as tecnologias utilizadas em cada parte: 
    
    
4 - A descrição e justificativa para uso de cada tecnologia escolhida; 

Tecnologias Utilizadas:
Angular CLI: 12.0.5
Bootstrap: 5.0.2,
Spring Boot: 2.5.2
Java: 1.8 e 1.11
Hibernate:5
MySql: 8.0.25
Docker:20.10.2
docker-compose1.25.0
Apache Maven 3.6.3

4.1 ANGULAR CLI
No front-end foi utilizado uma framework chamada angular, esse framework trabalha com SPA (Single Page Application) ou seja carrega apenas a página em que o usuário está e não toda aplicação de uma vez economizando tempo e largura de banda do que o envio constante de HTML. 
Outra vantagem de implantar nosso front-end como um aplicativo de página única é um controle de versão e reversão. Tudo o que precisamos fazer é criar uma versão de nossa saída de construção
Podemos configurar o servidor que está servindo nosso SPA com um parâmetro que especifica qual versão do aplicativo de front-end construir: é tão simples quanto isso!
Esse tipo de implantação pode ser dimensionado muito bem: servidores de conteúdo estático como o Nginx podem ser dimensionados para um grande número de usuários.

4.2 SPRING BOOT, JAVA e HIBERNATE
Utilizamos a linguagem Java no back-end Java em paralelo com o Spring Boot. Alguns benefícios pela opção dessa linguagem é por ser orientado a objeto permitindo a criação de programas modulares e um código mais reutilizável. Java é uma linguagem portátil devido ao seu recurso de independência de plataforma. Como o código Java pode ser executado em qualquer plataforma, ele é portátil e pode ser levado para qualquer plataforma e pode ser executado nelas.
O framework Spring Boot é uma microestrutura de código aberto. Algumas vantagens do Spring boot é a configuração automática. Independente, pois não há necessidade de implantar o aplicativo em um servidor web. Reduz o tempo de desenvolvimento e aumenta a produtividade no desenvolvimento do software. Ajuda a autoconfigurar todos os componentes para um aplicativo Spring de nível de produção.Torna mais fácil para criar e testar o software, fornecendo uma configuração padrão para testes de unidade e integração. Vem com servidores HTTP embutidos para testar aplicativos da web. Spring permite que você se conecte facilmente com banco de dados e serviços de fila e o principal o artefato Spring Boot pode ser implantado diretamente em containers Docker facilitando a criação de microsserviços rapidamente.
O Hibernate é um framework Java que simplifica o desenvolvimento de aplicações Java para interagir com o banco de dados. É uma ferramenta de código aberto e leve. O Hibernate implementa as especificações do JPA (Java Persistence API) para persistência de dados. O desempenho do hibernate framework é rápido porque o cache é usado internamente no hibernate framework. HQL (Hibernate Query Language) é a versão orientada a objetos do SQL. Ele gera as consultas independentes do banco de dados. Portanto, não precisa escrever consultas específicas ao banco de dados. O framework Hibernate fornece a facilidade de criar as tabelas do banco de dados automaticamente. 

4.4 DOCKER
O Docker foi projetado para tornar mais fácil criar, implantar e executar aplicativos usando contêineres.
Os contêineres são úteis, pois permitem que um desenvolvedor empacote um aplicativo com todos os elementos de que precisa, como bibliotecas, etc., e envie-o como um pacote.
Replicação - o Docker possui alta disponibilidade integrada. Quando você faz um contêiner Docker, outro é replicado. Isso garante que haja um contêiner de backup disponível caso ocorra algum erro.
Portabilidade - um dos principais benefícios do Docker é a sua portabilidade. Os usuários podem construir uma imagem e utilizá-la como um contêiner autossuficiente.
Escalabilidade - os contêineres do Docker também são fáceis de escalar. Depois que uma imagem estiver em execução, você pode dimensioná-la facilmente replicando o contêiner. Isso é realmente útil para desenvolvedores que precisam criar várias instâncias para teste, o que reduz o tempo de desenvolvimento.
Desenvolvimento - Docker é útil para desenvolvedores que precisam executar rapidamente um punhado de pequenos aplicativos para teste, em vez de girar uma máquina virtual totalmente especificada para fazer o mesmo trabalho.

4.5 DOCKER-COMPOSE
O Docker Compose traz alguns benefícios como:
Implantação de host único - Isso significa que você pode executar tudo em uma única peça de hardware;
Configuração rápida e fácil - devido aos scripts YAML;
Alta produtividade - Docker Compose reduz o tempo que leva para realizar tarefas
Segurança - Todos os contêineres são isolados uns dos outros, reduzindo o cenário de ameaças.
Pode-se observar no arquivo todos os serviços usados neste projeto.

4.6 MYSQL
Custo total de propriedade reduzido:
MySql um dos mais populares sistemas de gerenciamento de banco de dados de código aberto que permite gerenciar banco de dados relacional. Como o MySql é de código aberto, você pode usar o MySql gratuitamente e, se quiser, pode personalizar seu código-fonte de acordo com suas necessidades. A maioria das empresas prefere o MySQL porque não precisa pagar nada por este excelente produto.
Portabilidade:
MySQL é um servidor de banco de dados de plataforma cruzada. Ele pode ser executado em diferentes formatos de placa como Linux, Solaris e Windows, etc. É uma boa escolha para aqueles projetos que visam múltiplas plataformas, particularmente aplicativos da web. Na verdade, o MySQL é uma parte da famosa pilha de servidores LAMP (Linux Apache MySQL PHP) que é usada mundialmente para o desenvolvimento de aplicativos da web. O MySql oferece suporte a muitas plataformas com diferentes linguagens como C, C ++, PHP, PERL, JAVA, Python etc.
Conectividade perfeita:
Existem vários mecanismos de conexão seguros e contínuos disponíveis para conectar ao servidor MySQL. Essas conexões incluem pipes nomeados, soquetes TCP / IP e soquetes UNIX.

4.7 BOOTSTRAP
O Bootstrap é Fácil de Usar: O Bootstrap é muito fácil e bastante simples de usar para projetar e desenvolver. Por ser um novo framework, há muito o que aprender com ele. Pode ser usado com CSS, LESS ou SaaS etc.
Uma integração é bastante fácil: 
Bootstrap é uma estrutura que é facilmente integrada a estruturas em massa, sem interrupções com sites existentes ou novos.
Framework rápido e que economiza tempo: 
Bootstrap é um framework ágil que é bastante mais rápido do que outros frameworks. Ele economiza tempo devido aos seus blocos de codificação padronizados, capacidade de resposta e recursos de navegador cruzado.
Reforço de grades: um recurso mais recomendável é que o bootstrap contém estilos de grade de 12 colunas e oferece suporte à capacidade de resposta, contrapeso e elementos incorporados.
Aderir ao básico: Bootstrap é uma estrutura que contém elementos HTML de estilo de base, como tabelas, tipografia, botões, formulários, imagens, listas e ícones, etc.
Um pacote de fundamentos de JavaScript: 
Bootstrap oferece suporte a componentes de JavaScript para que não seja necessário conhecimento de script. Inclui componentes JavaScript como dicas de ferramentas, janelas modais, alertas, etc. para adicionar funcionalidades facilmente.
O suporte é incrível: 
Bootstrap é conhecido por sua grande comunidade de suporte e resposta ágil ou solução online para os problemas ou dúvidas. Ele também oferece uma excelente documentação junto com exemplos e demonstração. Ele fornece soluções para caloiros e veteranos.
O Bootstrap é totalmente personalizável: é amigável ao desenvolvedor e pode ser personalizado de acordo com os requisitos do projeto. CSS, utilitários, componentes e componentes Javascript comuns podem compor a aparência para facilitar os desenvolvedores.
Agile Responsive: Bootstrap é uma plataforma totalmente responsiva com suporte para layout de grade fluida. Ele cria um site pronto para celular de maneira fácil e suave e define o design da web de acordo com as dimensões do dispositivo específico.
Consistência do Bootstrap: 
Sites ou aplicativos móveis feitos com a tecnologia bootstrap podem fazer você sentir a incrível combinação de desenvolvedores e designers que garantem a consistência.

5 A descrição de cada funcionalidade implementada e o responsável por sua implementação;

Raphaela - 
Microsserviço Agendamento:
	A aplicação cadastra, edita, lista e exclui os agendamentos dos tutores e animais do sistema através de uma rest api.

Victoria -
Micro serviço Cadastro: 
	Este serviço envolve Cadastrar, Editar e Listar Tutores e Animais no Sistema, fornecendo as APIs.
obs: Aluna também é a responsável pela Infraestrutura com Docker.

6 - A descrição dos padrões de projeto utilizados e a justificativa para uso:

Repository Pattern
Sua utilização contribui no isolamento da camada de acesso a dados (DAL) com a camada de negócio, mais conhecida como camada de domínio.
O Repository Pattern permite um encapsulamento da lógica de acesso a dados, impulsionando o uso da injeção de dependência (DI) e proporcionando uma visão mais orientada a objetos das interações com a DAL.
Com o uso desse pattern, aplicamos em nossa camada de domínio o princípio da persistência ignorante (PI), ou seja, nossas entidades da camada de negócio, não devem sofrer impactos pela forma em que são persistidas no banco de dados.
Data Transfer Object – DTO
Um objeto simples usado para transferir dados de um local a outro na aplicação, sem lógica de negócios em seus objetos e comumente associado à transferência de dados entre uma camada de visão (view layer) e outra de persistência dos dados (model layer). Muito frequentemente usado em conjunto com um DAO.
A classe de negócios do lado do servidor normalmente busca dados do banco de dados e preenche o POJO e os envia ao cliente ou os passa por valor. Para o cliente, o objeto de transferência é somente leitura. O cliente pode criar seu próprio objeto de transferência e passá-lo ao servidor para atualizar os valores no banco de dados de uma só vez.

7 - Link para o manual (passo a passo) para instalação e configuração do sistema.

Vamos começar pelas dependências do front-end

7.1Aplicação Frontend

7.1.1.Instale o NodeJs com o seguinte comando:

sudo apt-get install nodejs

7.1.2.Verifique se foi instalado corretamente:

node --version  	e 	npm --version 

7.1.3.Entre no diretório do front-end:

		cd  veterinary-clinic

7.1.4.Rode os seguintes comandos para iniciar a instalação e iniciar a aplicação front-end.
		
		npm install
		
		npm start

7.1.5.Volte para o diretório principal veterinary-clinical-adm
		
		cd ..

7.2.
BACKEND
Serviços Cadastro e Agendamento.

referência: https://www.hostinger.com.br/tutoriais/install-maven-ubuntu

7.2.1.Comece atualizando o índice do pacote usando:

		sudo apt-get update

7.2.2.Depois, é preciso instalar o Maven com o comando:

sudo apt-get -y install maven

7.2.3.Você pode verificar a instalação do Maven usando o comando (funciona com os dois métodos de instalação):

		mvn -version

7.2.4.Agora você precisará entrar no diretório schedulingservice e register para iniciar a instalação das dependências presentes no pom e gerar os arquivos .jar que serão copiados para dentro do container onde as aplicações Spring Boot será iniciada.

cd schedulingservice

mvn clean install

		cd ../register

		mvn clean install

		cd ..

7.2.5. Após a instalação das dependências verifique se você está no diretório veterinary-clinical-adm, agora é preciso instalar o docker e o docker-compose.

		sudo apt-get install docker

		sudo apt-get install docker-compose

		sudo usermod -aG docker $USER


7.2.6.Feito isto, agora você pode subir o docker com os seguintes comando:

		docker-compose build 

		docker-compose up


