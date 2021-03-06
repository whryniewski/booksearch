module.exports = {
    'default e2e tests': browser => {
        browser
            .url(process.env.VUE_DEV_SERVER_URL)
            .waitForElementVisible('#app', 5000)
            .assert.elementPresent('.button')
            .assert.containsText('h1', 'Find a book!')
            .end()
    }
}
