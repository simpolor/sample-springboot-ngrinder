# 로컬에서 Ngrinder 스크립트 테스트 방법

1. maven 프로젝트를 생성

2. Add Framework Support.. 를 이용하여 Groovy 추가

3. 아래 내용을 pom.xml에 추가
```
<repositories>
    <repository>
        <id>ngrinder.maven.repo</id>
        <url>https://github.com/naver/ngrinder/raw/ngrinder.maven.repo/releases</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>org.ngrinder</groupId>
        <artifactId>ngrinder-groovy</artifactId>
        <version>${ngrinder.version}</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>commons-codec</groupId>
        <artifactId>commons-codec</artifactId>
        <version>1.4</version>
    </dependency>

    <dependency>
        <groupId>com.google.guava</groupId>
        <artifactId>guava</artifactId>
        <version>23.0</version>
    </dependency>

</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-eclipse-plugin</artifactId>
            <version>2.9</version>
            <configuration>
                <additionalProjectnatures>
                    <projectnature>
                        org.eclipse.jdt.groovy.core.groovyNature
                    </projectnature>
                    <projectnature>
                        org.eclipse.m2e.core.maven2Nature
                    </projectnature>
                </additionalProjectnatures>
            </configuration>
        </plugin>
    </plugins>
</build>
```

4. ngrinder를 위한 groovy 파일을 생성하여 테스트 진행

5. 실행시 VM 옵션에 아래 값을 추가 ( 실행하면 해당 값이 나옴 )
   -javaagent:/Users/parksy/.m2/repository/net/sf/grinder/grinder-dcr-agent/3.9.1/grinder-dcr-agent-3.9.1.jar