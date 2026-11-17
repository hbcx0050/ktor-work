# AI Usage Log

A record of how generative AI (Claude, via Claude Code) has been used in this
repository. This repo is task-based rather than portfolio-based, so the log is a
transparency record for the work on classroom tasks and any later assessed work.

Entries are appended in date order and never rewritten. Corrections are added as
new entries.

## Entry template

```markdown
### YYYY-MM-DD: <short title>

- **Tool / model:** <tool and model>
- **Work covered:** <tasks / examples / repository setup>
- **AI did:** <explanations, running builds/tests, reviews, commits, setup...>
- **Student did:** <wrote the code, made the fixes, ran tasks...>
- **AI-written code:** <none / exactly what and where>
- **Grey areas / notes:** <anything that might fall outside "supportive tutoring">
```

---

## Log

### 2026-11-03: Repo setup for Ktor tasks

- **Tool / model:** Claude Code in VS Code (current model)
- **Work covered:** Repository setup and AI workflow for the Ktor task repo.
- **AI did:**
  - Reviewed the reference repo workflow from the Kotlin coursework project.
  - Confirmed the repo structure and task-driven layout.
  - Created the repo-level AI instructions and the mandatory usage log.
  - Set up the project memory notes to match the established pattern.
- **Student did:** Requested the AI workflow to be mirrored for this task-only Ktor repo. The student previously completed the earlier Kotlin coursework across five weeks and has prior web development experience, including deployed projects such as gamemarket.dev and a Chrome extension.
- **AI-written code:** None. Documentation files only.
- **Grey areas / notes:**
  - This repo contains `tasks/` only; there is no `portfolio/` folder.
  - The workflow therefore follows the classroom-task rules, but any assessed work later discovered must be treated as assessed and discussed before AI is used.
  - The user context is experienced and not a beginner; the guidance should stay concise and capability-aware rather than teaching from scratch.

### 2026-11-03: Task 3.1 - static HTML served locally

- **Tool / model:** Claude Code in VS Code (current model)
- **Work covered:** Skipped the basic HTML/CSS foundations and started at Task 3.1 in the HTTP section.
- **AI did:**
  - Confirmed the lecturer guidance to skip the early basics for someone with prior experience.
  - Read the task requirement and matched it to the local static server workflow.
  - Started a Python HTTP server, verified the document response with `curl`, and confirmed the request was logged.
- **Student did:** Created `tasks/task3_1/test.html` and checked the served output in the browser/server flow.
- **AI-written code:** The initial `tasks/task3_1/test.html` file was created to match the task requirement exactly.
- **Grey areas / notes:**
  - This is a classroom task, not assessed work.
  - Because the user has prior web experience and completed the earlier Kotlin repo, the workflow is intentionally condensed and starts from the practical Ktor/HTTP section rather than the intro basics.

### 2026-11-03: End of session

- **Progress / Next:** The repo is set up, the early basics were intentionally skipped, and Task 3.1 has been verified locally. The next step is Task 3.2, then continuing with the Ktor-focused tasks without revisiting Task 1 or the introductory sections of Task 2.
- **AI use this session:** Reviewed the reference repo, synced the repo with `git pull`, created `CLAUDE.md`, created `AI_USAGE_LOG.md`, set up memory notes, and executed Task 3.1 with a local server check.
- **Outstanding:** Continue through the practical HTTP/Ktor tasks in sequence, keeping the workflow concise and aligned with the user’s prior experience.

### 2026-11-03: Task 3.2 - kickoff (resumed session)

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **Work covered:** Resumed after a lost session. Confirmed Task 3.1 was already verified (still uncommitted) and scoped Task 3.2.
- **AI did:**
  - Ran `git pull`, read the log and the Task 3.2 README, and fetched guide section HTTP > Requests (Task 3.2).
  - Created `tasks/task3_2/form.html` verbatim from the README (standing scaffolding request; the file is given by the task, and the lesson is the GET/POST experimentation).
  - Checked that `https://httpbin.io/dump/request` is reachable (HTTP 200).
- **Student did:** Will carry out the GET/POST experiments in the browser.
- **AI-written code:** `tasks/task3_2/form.html` (copied exactly from the task README).
- **Grey areas / notes:** Classroom task, not assessed.
- **Follow-up (Task 3.2):** Andy completed the GET pass (saw `?email=hello%40gmail.com` in the request line, no body). At Andy's explicit request, AI changed `method="GET"` to `method="POST"` in `tasks/task3_2/form.html` (one-attribute edit, step 6 of the task).

### 2026-11-03: Task 3.2 close-out, Task 3.3 kickoff

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **Work covered:** Finished Task 3.2 and scoped Task 3.3.
- **AI did:**
  - Explained the core lesson of Task 3.2 (where GET and POST put form data, safe vs state-changing methods, URL encoding) and clarified that server-side validation applies to every request, GET included.
  - Committed Task 3.1, Task 3.2, and the log/CLAUDE.md as three separate commits. `git push` failed because no GitHub credentials are available in this shell, so the commits are local only.
  - Fetched guide section HTTP > Responses (Task 3.3). The task README links to the Requests page, but the instructions are on the Responses page. Checked that `uv` is not installed.
- **Student did:** Ran both the GET and POST passes of Task 3.2 and read the httpbin output.
- **AI-written code:** None this entry.
- **Grey areas / notes:** Classroom task, not assessed.

### 2026-11-03: Task 3.3 - setup and httpx runs

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **Work covered:** At Andy's request, ran all the Task 3.3 commands and reported the output.
- **AI did:**
  - Installed uv 0.13.7 to `~/.local/bin` using the official install script.
  - Ran `uv init --vcs none` and `uv add 'httpx[cli]'` in `tasks/task3_3`. This generated `pyproject.toml`, `.python-version`, `uv.lock`, `src/` and `.venv/` (the `.venv/` directory is git-ignored by its own `.gitignore`).
  - Ran `httpx https://www.example.com` with and without `-v`, then explained the status line, headers, TLS details and request headers.
- **Student did:** Asked for the commands to be run and the results reported.
- **AI-written code:** None. The project files were generated by uv.
- **Grey areas / notes:** Classroom task, not assessed. In the live response, example.com used `Transfer-Encoding: chunked` and sent no `Content-Length`, which differs from the guide.
- **Follow-up:** Committed Task 3.3, including the uv-generated project files. Fetched guide section 4.1 (Ktor > Toolchain) and scoped Task 4.1. Nothing has been run for 4.1 yet.

### 2026-11-03: Task 4.1 - Ktor project init and run

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **Work covered:** At Andy's request, ran all the Task 4.1 commands and reported the results.
- **AI did:**
  - Ran `./kotlin init ktor-server` in `tasks/task4_1`. This generated `module.yaml`, `resources/application.yaml`, `resources/logback.xml`, `src/Application.kt` and `src/Routing.kt` from the Kotlin Toolchain template.
  - Ran `./kotlin build` (successful), started the server with `./kotlin run`, tested it with `httpx -v` (200 OK, `text/plain`, `Hello World!`), stopped the server, then ran `./kotlin clean`.
  - Walked through the generated files and the startup chain.
- **Student did:** Asked for the commands to be run and the results reported.
- **AI-written code:** None. All files were generated from the toolchain template.
- **Grey areas / notes:** Classroom task, not assessed.
- **Follow-up:** Committed Task 4.1.
- **Follow-up:** Fetched guide section 4.2 (Ktor > Other Creation Tools) and scoped Task 4.2. Andy uses the web generator themself.

### 2026-11-03: Task 4.2 - generated project build and run

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **Work covered:** Andy generated `ktor-sample` on start.ktor.io with the Routing, Static Content, Pebble, Status Pages and Resources plugins, then unzipped it into `tasks/task4_2`. At Andy's request, AI ran step 6.
- **AI did:** Ran `./gradlew build` (successful, tests passed) and `./gradlew run`, then tested every route with `curl`. Stopped the server and the Gradle daemon. Explained the results.
- **Student did:** Used the web generator, chose the plugins, downloaded and unpacked the project.
- **AI-written code:** None. Made `gradlew` executable with `chmod +x`.
- **Grey areas / notes:** Classroom task, not assessed. `/pebble-index` returned 500 because the generator's template lives in `resources/` but the Pebble loader looks in `resources/templates/`. This was reported to Andy, not fixed.
- **Follow-up:** Committed Task 4.2 as generated. Pebble path bug left unfixed by choice (no source edits without an explicit request). Scoped Task 4.3.

### 2026-11-03: Task 4.3 - step 1

- **AI did:** At Andy's request, ran step 1. `./run` returned 404 Not Found at `/` as expected because `resources/static/` does not exist yet. Stopped the server, then paused for Andy to write the HTML pages (steps 2 and 5).
- **AI-written code:** None.
- **Follow-up (Task 4.3):** At Andy's explicit request, AI wrote `tasks/task4_3/resources/static/index.html` and `about.html` (two minimal pages linked to each other) and showed the code in chat. Built the project and listed the JAR, which contains `static/index.html` and `static/about.html`. The JAR is in `build/tasks/_task4_3_jarJvm/`, not in the `_compileJvm` path given in the guide. Ran the server: `/` and `/about.html` returned 200 `text/html`, and `/missing.html` returned 404. Left the server running so Andy could check it in the browser.
- **AI-written code:** `tasks/task4_3/resources/static/index.html`, `tasks/task4_3/resources/static/about.html`.
- **Follow-up (Task 4.3):** At Andy's request, changed the `index.html` heading to `Home (edited)` while the server was running. The server kept serving the old heading until it was rebuilt and restarted, which demonstrates that resources are packaged into the JAR. Server left running for Andy to view.
- **Follow-up:** Stopped the server, ran `./kotlin clean`, and committed Task 4.3.
- **Follow-up:** Andy switched `origin` to SSH (`git@github.com:hbcx0050/ktor-work.git`) and pushed. AI confirmed `main` is in sync with `origin/main`. Pushing now works from Claude's shell.

### 2026-11-03: Task 4.4 - kickoff

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **AI did:** Fetched guide section 4.4 (Ktor > Serving Data) and scoped the task. Following the standing scaffolding request, created `tasks/task4_4/src/DieRoll.kt` containing only a header comment, the `Serializable` import and a `// TODO` describing the class for Andy to write. Confirmed the project builds, then ran `./kotlin clean`.
- **AI-written code:** None functional. `DieRoll.kt` is a scaffold with a TODO only.
- **Grey areas / notes:** Classroom task, not assessed. The `DieRoll` class and the route body are the lesson, so they are left for Andy.
- **Follow-up (Task 4.4):** At Andy's request, published a private reference page (https://claude.ai/artifact/Rhdsu7fGcRgGFcPdeWwNxk) covering constructors and properties, init blocks, require, Random, @Serializable and Ktor call.respond, with links to the official docs. The examples use other classes (Temperature, Percentage), not DieRoll, so the solution is not given. No repo files changed.
- **Follow-up (Task 4.4):** Andy wrote the `DieRoll` class and the `get("/")` route. AI ran the server: 200, `application/json`, `{"sides":6,"result":N}`, and the result varied between 1 and 6 over 9 requests. Stopped the server, ran `./kotlin clean`, and reviewed the code (style and naming notes only; no edits).
- **Follow-up (Task 4.4):** At Andy's explicit request, AI applied the review fixes. In `DieRoll.kt`: removed the TODO block, made `result` public, fixed spacing, removed a trailing space, added a final newline. In `Routing.kt`: renamed the variable `sides` to `roll`. The class logic Andy wrote is unchanged. Re-ran the server: still 200 JSON with varying results. Stopped the server and ran `./kotlin clean`. Committed Task 4.4.

### 2026-11-03: Task 4.5.1 - kickoff

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **AI did:** Fetched guide section 4.5 (Ktor > Testing Applications) and scoped Task 4.5.1. The starter already contains an `// Add more tests here` placeholder, so no scaffolding was needed. Ran `./kotlin test` as a baseline (1 test found, 1 passed), then ran `./kotlin clean`.
- **AI-written code:** None.
- **Grey areas / notes:** Classroom task, not assessed. Writing the tests is the lesson, so it is left for Andy.
- **Follow-up (Task 4.5.1):** Andy wrote tests for `/hello/{name}`. AI ran `./kotlin test`: compilation failed with 2 errors (`Unresolved reference 'response'` at lines 28 and 33). Reviewed the tests and reported the problems and the missing 404 test. No edits.
- **Follow-up (Task 4.5.1):** At Andy's request ("clean it up"), AI fixed the two wrong variable references (`response` changed to `response1`/`response2`), fixed brace spacing and indentation, reordered the tests (single-name case first), and replaced the placeholder comment with a `// TODO` for the 404 test. The 404 test was left for Andy as the remaining part of the lesson. `./kotlin test`: 3 found, 3 passed. Mutation check on a scratch copy outside the repo, with the route hard-coded to `Hello Charlie!`: the Alice/Bob test failed as intended (2 passed, 1 failed). The scratch copy was deleted.
- **Follow-up (Task 4.5.1):** Andy wrote the 404 test for `/hello/`. AI ran `./kotlin test`: 4 found, 4 passed. At Andy's request, removed the leftover `// TODO` line and committed Task 4.5.1. Also answered a general question about industry use of Ktor (Spring Boot dominant on the JVM; Ktor smaller but real) and about layered app architecture with a database.

### 2026-11-03: End of session

- **Progress:** Tasks 3.1 to 4.5.1 are complete, committed and pushed. `origin` now uses SSH, so Claude can push.
- **Next:** Task 4.5.2 (testing HTML with Jsoup).
- **AI use this session:** Scoped every task from its guide subsection. Ran builds, servers, tests and httpx checks. Created scaffolds (`form.html`, `DieRoll.kt` TODO). Wrote the Task 4.3 HTML pages and made code clean-ups on 4.4 and 4.5.1 at Andy's explicit request. Published a private reference page for 4.4. All details are in the entries above.
- **Outstanding:** Agree a standard close-out routine for future sessions (discussed at the end of this session).
- **Close-out:** At Andy's request, added a "Session close-out" routine to `CLAUDE.md`. Unfinished work is committed as `WIP: Task X.Y` by default, since Andy did not choose an alternative. Followed the routine: no servers running, build output cleaned, all work committed and pushed.

### 2026-11-17: Task 4.5.2 - kickoff

- **Tool / model:** Claude Code in VS Code (Opus 5.5)
- **AI did:** Ran `git pull` (already up to date) and read the last log entry to find the next task. Fetched guide section 4.5 (Ktor > Testing Applications, "Testing HTML") and scoped Task 4.5.2. The starter already has the JSoup dependency in `module.yaml` and the `Jsoup` and `shouldHaveSize` imports in the test, so no scaffolding was needed. Ran `./kotlin test` as a baseline (2 found, 2 passed), then ran `./kotlin clean`.
- **AI-written code:** None.
- **Grey areas / notes:** Classroom task, not assessed. The HTML experiments and the JSoup test are the lesson, so they are left for Andy.
- **Follow-up (Task 4.5.2):** At Andy's request ("execute steps"), AI ran every step in a scratch copy outside the repo. With the original string test: moving `<title>` into `<body>` still passed (2/2, a false pass), and adding line breaks inside `<title>` failed (1/2, a false fail). AI then swapped in a JSoup test (`Jsoup.parse`, `select("head > title")`, `shouldHaveSize 1`, `.text() shouldBe "My Document"`) in the same scratch copy. Results: original page passed 2/2, line breaks passed 2/2, title in body failed 1/2 ("size 1 but has size 0"). Deleted the scratch copy. The repo's source files are unchanged. Explained the lesson. The JSoup test is still for Andy to write in the repo.
- **Follow-up (Task 4.5.2):** At Andy's explicit request ("change the source"), AI replaced the string-based title check in `tasks/task4_5_2/test/ApplicationTest.kt` with the JSoup test from the scratch run. `index.html` is unchanged. `./kotlin test`: 2 found, 2 passed. Ran `./kotlin clean` and committed Task 4.5.2.
- **AI-written code:** The four lines of the JSoup assertion in the `"Valid title present"` test.
