He decidido hacer un doble Observer-Observable. 
Las agencias son Observers que observan al Broker, 
que es Observable y Observer del mercado de bolsa, 
que a su vez es solo Observable 
y construido con un patrón Singleton.

Dentro del StockExchange he hecho un par de métodos,
aumentar y reducir valor, que modifican el valor al azar.

En el main, clase App, se llama a un bucle que mientras el valor
no baje de 0, seguirá aumentando o reduciéndose, notificando
cada vez que lo haga al Broker, que a su vez notificará a las 
Agencias. 