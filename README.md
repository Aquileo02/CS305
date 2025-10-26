# CS 305 Portfolio Reflection – Artemis Financial

### Client Overview
Artemis Financial is a financial services company that needed stronger protection for client data during online
transactions. They wanted me to analyze their existing software for vulnerabilities and then refactor it to follow modern
secure-coding practices. The main goal was to add SSL/TLS encryption and implement checksum validation to guarantee data
integrity.

### What I Did Well
I think I did a solid job setting up the SSL certificate and integrating SHA-256 for checksum verification. That part made
me appreciate how secure code prevents data tampering or interception. Writing clean and secure code isn’t just a checkbox
it keeps a company’s reputation intact and prevents huge financial risks down the line.

### Challenges and Learning
The vulnerability scan using OWASP was a little tricky at first because of dependency issues, but once I got it working, it
really helped me understand how open-source libraries can become weak spots. Running the scan and seeing a “Build Success”
felt like proof that everything was secure and stable.

### Increasing Security Layers
I added multiple layers of security: HTTPS for encryption, SHA-256 for integrity, and OWASP dependency checks for safe
libraries. If I were doing this on a real team, I’d also use tools like Snyk or SonarQube to monitor vulnerabilities and
apply patch management regularly.

### Testing Functionality and Security
After refactoring, I ran the Spring Boot app and confirmed that `/checksum` returned the expected hash. I checked for SSL
functionality using `https://localhost:8443`. Then I re-ran OWASP Dependency-Check to confirm no new issues were introduced.

### Helpful Tools and Practices
Spring Boot, Maven, OWASP Dependency-Check, and Java’s Keytool were the most useful tools. I also stuck to secure-coding
principles from OWASP and NIST, which I’ll definitely keep applying in future backend projects.

### Portfolio Value
This project is something I’d actually show an employer. It demonstrates my understanding of secure data transmission,
encryption, and vulnerability management—all real-world backend skills that companies value. It also shows that I can
troubleshoot, refactor, and verify that code is both functional and secure.
