
# Extra credit 2
The application is developed with java 17 and maven, using gRPC and protocol buffers to establish connection between clients and server. The pom.xml is modified to create the protoc generated JAVA files in the desired directory. 

```bash
extra features: 
** connect and list
every client needs to connect with the grpc server to perform indexing and search.
this feature is to accomadate the extra list command in the server. 

```

## download the datasets, unzip and give read write and execute access to the datasets


```bash
chmod 777 /path/to/dataset 
```

## Installation and setup

```bash
sudo apt install openjdk-17-jdk maven
git clone git@github.com:neurobazaar/csc435-ea2-arunpalanisamy98.git
```

## compilation 
```bash
## no need to compile with protoc plugin, maven compiles the proto files and generates java file. 
## the location where java files needs to be generated are included in pom.xml
cd /path/to/csc435-ea2-arunpalanisamy98/app-java
mvn clean compile
mvn package

```
## running the server 
```bash
mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalServer" -Dexec.args="$hostname $port_number"

example

mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalServer" -Dexec.args="localhost 8080"
```
## list
```bash
>list
```
## quit
```bash
>quit
```


## running the client 
````bash
the port number for client is just a placeholder,
the client will not try to open a socket or a connection in the given port,
the purpose of this is to create a unique clientId for each client.
so give a unique port number for each client
````
```bash
mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalClient" -Dexec.args="$client_hostname $client_port_number"

example 

mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalClient" -Dexec.args="localhost 5050"
mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalClient" -Dexec.args="localhost 5051"
mvn exec:java -Dexec.mainClass="csc435.app.FileRetrievalClient" -Dexec.args="localhost 5052"
```
## connecting 
```bash
>connect $server_hostname $port_number

example
> connect 127.0.0.1 8080
connected to 127.0.0.1 at port 8080
```
## rule
```bash
indexing and searching will not work without connecting first
```
## indexing
```bash
>index /path/to/dataset/folder

example

> index /Users/arun/DePaul/CSC435/Data/input/Dataset2/folder8
Indexing took 3 seconds
> index /Users/arun/DePaul/CSC435/Data/input/Dataset1/folder15
Indexing took 2 seconds
```
## searching
```bash
>search $arg1
>search $arg1 AND $arg2

example for single word search

> search are
* Dataset-1/ document29.txt 20
* Dataset-1/ document5.txt 18
* Dataset-1/ document129.txt 19
* Dataset-2/ document759.txt 30
* Dataset-2/ document525.txt 32
* Dataset-2/ document237.txt 19
* Dataset-2/ document826.txt 21
* Dataset-1/ document65.txt 19
* Dataset-2/ document494.txt 30
* Dataset-1/ document227.txt 19

example for searching two words

> search are AND the
* Dataset-1/ document65.txt 180
* Dataset-2/ document826.txt 216
* Dataset-2/ document237.txt 177
* Dataset-2/ document759.txt 448
* Dataset-1/ document5.txt 476
* Dataset-1/ document274.txt 432
* Dataset-1/ document227.txt 178
* Dataset-2/ document254.txt 497
* Dataset-1/ document129.txt 179
* Dataset-1/ document29.txt 182


```
## quit
```bash
>quit
```


## Credtis

created by apalanis@depaul.edu(Arun Kumar palanisamy) for Extra credit 2. Instructor name: Alexandru Orhean.

