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
