# Либа-демонстратор.

# Использование.
## Импорт либы.
```xml
<project>
    ...
    <repository>
        <id>sorter-mvn-repo</id>
        <url>https://raw.github.com/SergeyYudaev/sorter/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
    ...
    <dependency>
        <groupId>ru.syudaev</groupId>
        <artifactId>sorter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
    ...
</project>
```
## Запуск из командной строки
- скачать утилиту https://github.com/SergeyYudaev/sorter/blob/sorter-repo/sorter-0.0.1-SNAPSHOT.jar 
- Windows. В консоли ввести следующие команды: 
  - cd \
  - cd users\[имя пользователя]\downloads  
  - chcp 65001
  - java -jar sorter-0.0.1-SNAPSHOT.jar
