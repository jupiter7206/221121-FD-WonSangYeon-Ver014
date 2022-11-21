<template>

    <v-card outlined>
        <v-card-title>
            메뉴판 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '메뉴판ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/메뉴판/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

