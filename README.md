# Либа-демонстратор.
### Использование.
- Добавить репозиторий в pom.xml.
```xml

<repository>
    <id>sorter-mvn-repo</id>
    <url>https://raw.github.com/SergeyYudaev/sorter/mvn-repo/</url>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
    </snapshots>
</repository>
```
- Добавить зависимость в pom.xml.
```xml

<dependency>
    <groupId>ru.syudaev</groupId>
    <artifactId>sorter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```