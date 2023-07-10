<template>
    <v-card outlined>
        <v-card-title>
            CreateMatch
        </v-card-title>

        <v-card-text>
            <String label="MatchId" v-model="value.matchId" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Interests" v-model="value.interests" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createMatch"
            >
                CreateMatch
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateMatchCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.matchId = '';
            this.value.userId = '';
            this.value.interests = [];
        },
        watch: {
        },
        methods: {
            createMatch() {
                this.$emit('createMatch', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

