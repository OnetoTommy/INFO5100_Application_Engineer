<template>
  <div>
    <h1>{{ title }}</h1>
    <span>{{ rating }}</span>
    <button @click="functionA">Click Me</button>
  </div>
</template>

<script>
export default {
  name: 'Movie',
  props: ["title", "rating"],
  data() {
    return {
      
    }
  },
  methods: {
    functionA() {
      alert('Function A called');
    }
  }
}
</script>