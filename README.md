1.Download the Kafka :https://kafka.apache.org/downloads
2.Unzip the jar

3.Run Kafka Server:
Step 1: Kafka requires Zookeeper to run. Basically, Kafka uses Zookeeper to manage the entire cluster and various brokers. Therefore, a running instance of Zookeeper is a prerequisite to Kafka.

To start Zookeeper, we can open a PowerShell prompt and execute the below command:

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

If the command is successful, Zookeeper will start on port 2181.

Step 2: Now open another command prompt and change the directory to the kafka folder. Run kafka server using the command:

.\bin\windows\kafka-server-start.bat .\config\server.properties
Now your Kafka Server is up and running, you can create topics to store messages. Also, we can produce or consume data directly from the command prompt.

