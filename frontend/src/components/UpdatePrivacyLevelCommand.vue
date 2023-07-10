<template>
    <v-card outlined>
        <v-card-title>
            UpdatePrivacyLevel
        </v-card-title>

        <v-card-text>
            <String label="SecurityId" v-model="value.securityId" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="PrivacyLevel" v-model="value.privacyLevel" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updatePrivacyLevel"
            >
                UpdatePrivacyLevel
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
        name: 'UpdatePrivacyLevelCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.securityId = '';
            this.value.userId = '';
            this.value.privacyLevel = '';
        },
        watch: {
        },
        methods: {
            updatePrivacyLevel() {
                this.$emit('updatePrivacyLevel', this.value);
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

