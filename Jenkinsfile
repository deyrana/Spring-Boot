pipeline{
	agent any
	stages{
		stage('SCM Checkout'){
			steps{
				git 'https://github.com/deyrana/Spring-Boot'
			}
		}
		stage('Compile-Package'){
			steps{
				step {
					def mvnHome = tool name: 'maven-3', type: 'maven'
					sh "${mvnHome}/bin/mvn -version"
					sh "${mvnHome}/bin/mvn clean install"
				}
			}
		}
	}
	post {
		always{
			cleanWs()
			echo 'Build Finished'
		}
		failure{
			echo 'Build Failed'
		}
		success{
			echo 'Build Success'
		}
	}
}
