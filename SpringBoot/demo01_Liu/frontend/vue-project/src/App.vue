<template>
  <div id="app">
    <Movie v-for="movie in movies" :key="movie.id" :title="movie.title" :rating="movie.rating"></Movie>
    <Hello></Hello>
  </div>
</template>

<script>
import Movie from './components/Movie.vue'
import Hello from './components/Hello.vue'
export default {
  name: 'App',
  data() {
    return {
      movies: [
        { id: 1, title: '金刚狼', rating: 8.7 },
        { id:2, title: '速度与激情', rating: 9.2 },
        { id:3, title: '复仇者联盟', rating: 9.5 }
      ]
    }
  },
  components: {
    Movie,
    Hello
  }
}
</script>

<style >

</style>
