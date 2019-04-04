package snippet;

public class Snippet {
	public static void main(String[] args) {
		<build> <plugins>
				<plugin>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-maven-plugin</artifactId>
					<version>2.0.1.RELEASE</version>
					<executions>
						<execution>
							<goals>
								<goal>repackage</goal>
							</goals>
						</execution>
					</executions>
				</plugin>
		</plugins> </build>
		
	}
}

