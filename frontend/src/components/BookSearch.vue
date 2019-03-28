<template>
    <div>
        <h1>Find a book!</h1>

        <input type="text" v-model="bookTitle" placeholder="book title">

        <button @click="searchForBooks()" @keyup.enter.native="searchForBooks()">Search for books</button>
        <br/><br/>
        <b-spinner v-if="waiting" variant="primary" label="Spinning"></b-spinner>
        <b-table :items="booksRetrieved">
            <template slot="url" slot-scope="data">
                <a :href="`${data.value}`" target="_blank">{{ data.value }}</a>
            </template>
            <template slot="searchMethod" slot-scope="data">
                {{ data.value.name }}
            </template>
        </b-table>
    </div>
</template>

<script>
    import {AXIOS} from './http-common'

    export default {
        name: 'user',

        data() {
            return {
                bookTitle: '',
                booksRetrieved: [],
                waiting: false
            }
        },
        methods: {
            searchForBooks() {
                var params = new URLSearchParams()
                this.waiting = true
                params.append('title', this.bookTitle)
                AXIOS.post(`/search`, params)
                    .then(response => {
                        this.booksRetrieved = response.data
                        console.log(this.booksRetrieved)
                        this.waiting = false
                    })

            }
        }
    }

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h1, h2 {
        font-weight: normal;
    }

    ul {
        list-style-type: none;
        padding: 0;
    }

    li {
        display: inline-block;
        margin: 0 10px;
    }

    a {
        color: #42b983;
    }
</style>
