# Либа-демонстратор.

### Использование.

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