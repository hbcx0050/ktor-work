// Task 6.5: populating database tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    transaction(MusicDatabase.db) {
        // Start from empty tables

        SchemaUtils.drop(ArtistTable, AlbumTable)
        SchemaUtils.create(ArtistTable, AlbumTable)

        // Add at least three artists
        val beatles = ArtistTable.insertAndGetId {
            it[artistName] = "The Beatles"
        }
        val milesDavis = ArtistTable.insertAndGetId {
            it[artistName] = "Miles Davis"
            it[isSolo] = true
        }
        val taylorSwift = ArtistTable.insertAndGetId {
            it[artistName] = "Taylor Swift"
            it[isSolo] = true
        }

        // Add at least four albums
        AlbumTable.insert {
            it[title] = "Abbey Road"
            it[year] = 1969
            it[artist] = beatles
        }
        AlbumTable.insert {
            it[title] = "Kind of Blue"
            it[year] = 1959
            it[artist] = milesDavis
        }
        AlbumTable.insert {
            it[title] = "1989"
            it[year] = 2014
            it[artist] = taylorSwift
        }
        AlbumTable.insert {
            it[title] = "Revolver"
            it[year] = 1966
            it[artist] = beatles
        }
    }
}
