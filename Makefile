run-dev:
	APP_ENV=development ./gradlew run --console=plain

run-dist:
	./build/install/app/bin/app

report:
	./gradlew jacocoTestReport
