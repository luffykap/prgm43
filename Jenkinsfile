pipeline{
	agent any
	
	tools{
		jdk 'jdk'
		maven 'maven'
	}
	
	stages{
		stage('build'){
			steps{
				sh 'mvn clean compile'
			}
		}
		stage('test'){
			steps{
				sh 'mvn test'
			}
		}
		stage('package'){
			steps{
				sh 'mvn package'
			}
		}
		stage('run'){
			steps{
				sh 'mvn exec:java -Dexec.mainClass="com.luffy.App" '
			}
		}
		stage('commit'){
			steps{
				withCredentials([
					usernamePassword(
						credentialsId:'github-creds',
						usernameVariable:'GITHUB_USER',
						passwordVariable:'GITHUB_TOKEN'
						)
					]
			){
				sh '''
					git config user.name "luffykap"
					git config user.email "luffykapill@gmail.com"
					git add destination.txt
					git commit -m "dn"
					
					git push http://${GITHUB_USER}:${GITHUB_TOKEN}@github.com/luffykap/prgm43.git  HEAD:main'''
					}
					}
				}
					
			
		
		
	}
	
	post{
		success{
			echo 'success'
		}
		failure{
			echo 'failure'
		}
	}
}
