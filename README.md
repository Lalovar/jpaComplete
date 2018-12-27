# JPA Training for HCL fresher's
## Eduardo Lucatero.
____________________________________________________________________________

###### Enviroment.
- ubuntu 14.04 lts
- java 1.8
- msyql 5.5
- gradle 5


###### ____________ INSTALL JAVA-8 ____________ 
1. Add the PPA.
 ``` sudo add-apt-repository ppa:webupd8team/java ``` 
2. Update and install the installer script:
 ``` sudo apt update; sudo apt install oracle-java8-installer ``` 
3. Check the Java version
 ``` javac -version ``` 
4. Set Java environment variables
 ``` sudo apt install oracle-java8-set-default ``` 

###### ____________ INSTALL GRADLE-5 ____________ 
1. Install SdkMan
 ``` 
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk version
 ``` 
2. Install gradle
 ``` sdk install gradle 5.0 ``` 

###### ____________ install Mysql ____________ 
1. If needed update repositories
 ``` sudo apt-get update ``` 
2. Install mysql server
 ``` sudo apt-get install mysql-server ``` 
3. Start the MySQL service
 ``` systemctl start mysql  ``` 
or 
 ``` sudo /etc/init.d/mysql start  ``` 

###### ____________ create Database ____________ 
1. Connection to db with credentials
 ``` mysql -h localhost -u root ``` 
2. View '/resources/queries.txt' file

###### ____________ init gradle project ____________ 
 ``` gradle init --type java-application ``` 
