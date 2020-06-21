node{
	stage('SCM Checkout'){
		git 'https://github.com/deyrana/Spring-Boot'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}