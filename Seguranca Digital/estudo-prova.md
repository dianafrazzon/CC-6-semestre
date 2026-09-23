# Devo saber oque é
- tríade CIA [X]
- etapas do teste de invasão [X]
- modelo TCP/IP, suas divisões e protocolos por fases [X]
- protocolo NAT, tipos e consequencias [X]
- ataques comuns [X]
- DHCP [X]
- DNS [X]
- Mapeamento de rede etapas
- Handshake SYN SYN-ACK ACK [X]
- SCAN e tipos 
- oque é pen-test [X]
- comandos para o terminal [X]
- FHS -RWXRWXRWX
- NMAP e FLAGS [X]
- bannergrabing [X]

# conteúdo

TRÍADE CIA - é um conceito de segurança digital que significa Confidencialidade(somente pessoas autorizadas podem acessar), Integridade((os dados devem permanecer os mesmos sem tirar nem por) e Disponibilidade(acessíveis aos usuários autorizadas sempre que desejado)

---

ETAPAS TESTE DE INVASÃO
- reconhecimento - mapear tudo que é informação pública e de rede. IP, Portas, Serviços (Internet)
- varredura de portas - descobrir quais portas TCP/UDP estão ativas no alvo (Transporte)
- enumeração de serviços - detalha quais as portas ativas para extrair dados, como: versões, banners, usuários (Aplicação)
- exploração - usar falhas identificadas para obter acesso
- relato - documentação

Ainda há os tipos de invasão: whitebox, graybox, blackbox

---

CAMADAS TCP/IP
- Aplicação - camada mais exposta onde usuário e software se comunicam. 
	- HTTP
 	- DNS
	- SSH
	- FTP
- Transporte - organiza entrega de dados, as portas
	- TCP
 	- UDP 
- Internet - endereça hosts e encaminha pacotes em diferentes redes
	- IP
 	- ICMP
- Acesso à rede - coloca os bits físicos no meio digital
	- Ethernet
 	- Wi-fi

---

PROTOCOLO NAT - é a solução para a limitação de quantidade de hosts do IPv4. Protocolo que traduz endereços privados em endereços públicos para a internet. Excelente para sub-redes e ocultamento da topologia interna
Tipos:
- NAT estático - um endereço privado para um endereço público, par fixo
- NAT dinâmico - um endereço privado para uma pool de endereços públicos 
- PAT/NAT Overload - muitos endereços privados usando um endereço público, diferenciados pela porta

---

ATAQUES COMUNS
- Sniffing - captura passiva do tráfego, é como "cheirar" a rede
- Spoofing - falsa identidade na rede
- Man-In-The-Middle - intercepta comunicação pondo-se entre duas partes
- DoS/DDoS - negação de serviço, sobrecarga de requisição até indisponibilizá-lo

---

DHCP - protocolo para o host receber um endereço. Ocorre antes do NAT
- Discover -> Host envia broadcast para identificar servidores na rede
- Offer -> Servidor responde oferecendo um IP disponível completo
- Request -> Host solicita o uso do endereço oferecido
- Acknowledge -> Servidor confirma a concessão

---

DNS -> tradução de um endereço de site para um IP numérico

---

HANDSHAKE do TCP - consiste em três etapas: SYN, SYN-ACK, ACK. 
- SYN -> cliente envia para servidor uma flag SYN para iniciar comunicação
- SYN-ACK -> servidor confirma solicitação e envia o número de sequência
- ACK -> cliente envia confirmando a resposta e assim estabelecendo uma comunicação TCP

Se a porta estiver aberta -> serviço responde normalmente  
Se a porta estiver fechada -> host ativo, porta sem serviço  
Se a porta estiver filtrada -> firewall descarta pacote e não envia nada

---

MAPEAMENTO DE REDE

---

NMAP & FLAGS

| FLAP | Descrição |
| -------- | ----------- |
| -sS      | SYN scan     |
| -sT        | Connect scan     |
| -sU        | varredura de portas UDP     |
| -sV        | detecta versão do serviço rodando em cada porta     |
| -O      | identifica o sistema operacional do alvo     |
| -p        | define quais portas varrer     |
| -A        | modo agressivo: combinação de -sS -O e scripts    |
| -T4        | define velocidade do scan (0 = lento; 5 = rápido)     |



| comandos terminal        |descricao     |
| ---------| ------------|
| -oN     | salva a saída em um arquivo de texto     |

---

BANNERGRABING -> técnica mais simples de enumeração, perguntar diretamente ao serviço quem ele é, assim a resposta é um banner com informações importantes como a qual sistema operacional utilizado, qual sua versão, etc.

---
