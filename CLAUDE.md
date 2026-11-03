# CLAUDE.md

Guidance for Claude (or any AI assistant) working in this repository.

## What this repo is

Andy's fork of the COMP2850 (Software Engineering, University of Leeds) Ktor
web development repo, covering weeks 6-11 of the module.

Andy previously completed the earlier Kotlin coursework repo across five weeks of
lectures, so this is not a novice-facing repo. They also have prior web
development experience, including deployed work such as a live site and a Chrome
extension, so the workflow should assume reasonable technical foundations and
move at a capable, concise pace.

- `tasks/taskN_M[_K]/`: classroom tasks, numbered by section of the
  [Ktor Web Development Guide](https://comp2850.github.io/ktor-guide/). Not
  assessed. Many READMEs say "see the Guide", so fetch the matching guide
  subsection for each task.
- `examples/`: reference code for Ktor applications. This directory is for study
  only; do not modify it.
- `tasks/` is the main working area. This repo has no `portfolio/` folder.
  If any assessed coursework turns up later (for example, a Part 2 project),
  treat it as assessed work, apply the full portfolio restrictions, and ask Andy
  first.
- Staff inspect this repo, so code style and commit messages matter.

## AI usage rules

AI may be used only in a supportive, tutoring capacity.

Allowed: explaining or clarifying tasks, guide sections, Ktor syntax, error
messages, server setup, and validation steps.

Not allowed for assessed work: producing code, writing or other artefacts that
get submitted, or debugging/fixing the student's code.

How to apply this here:

- This repo has no `portfolio/` folder. The work is in `tasks/`, which are
  classroom tasks rather than assessed submissions.
- Classroom tasks are allowed to receive AI help, but Andy writes the code.
  The point is to learn web development and Ktor.
- The task is still a learning exercise, so by default: explain the activity,
  point to the right guide subsection, give hints and conceptual guidance.
  Reviewing finished task code and explaining what it does or misses is OK.
- Never edit source files unless Andy explicitly asks for that specific change,
  and record it in the log if so. "Source files" includes `.kt`, `.html`,
  `.css`, `.peb` templates and SQL files.
- **Scaffolding (standing request):** when starting a task whose source files are
  empty or missing, add only the boilerplate the task doesn't teach. Write the
  task's actual lesson as a `// TODO` comment (or `<!-- TODO -->` for HTML/CSS)
  for Andy. Check that it builds or serves, and log it. If a task is entirely
  its own lesson, say so clearly.
- If any assessed coursework turns up later, apply the full portfolio
  restrictions immediately and ask Andy first.

## Logging AI usage (required)

`AI_USAGE_LOG.md` is the record of how AI was used in this repo. At the end of
every session, append an entry using the template at the top of that file. Be
factual and complete, including anything in a grey area. Never rewrite or delete
past entries; add corrections as new entries.

## Workflow

- Work through tasks in numeric order (see the log for where things are up to).
- Always `git pull` before starting, and push after committing.
- Commit each task separately when Andy says it's done, with a message like
  `Task 4.3: first Ktor routes`.
- **Do not add `Co-Authored-By` (or any other AI attribution) trailers to commit
  messages.** AI involvement is recorded in `AI_USAGE_LOG.md`, not in commit
  metadata.

## Running servers and checks

- `./run` starts a long-running Ktor server in the task directory. Run it in the
  background, then check it with `curl http://localhost:8080/...` or the port in
  `resources/application.yaml`.
- Relay what the server returns in plain terms, and always stop the server
  afterwards.
- For HTML/CSS tasks, use the W3C validator or the check the task asks for.
- For Ktor tasks, build or run the app and report the result before moving on.

## Andy's preferences

- Has already completed the earlier Kotlin work across the first five weeks of the
  module and is therefore not a beginner in the course's core concepts.
- Has prior web development experience and understands the fundamentals behind
  deployed projects and browser tooling.
- Prefers concise, direct explanations: what the task is about, which guide
  section to read, then hints.
- Andy writes the code, and Claude runs it, checks it and commits.
- Always fetch and cite the matching Ktor guide subsection before explaining a
  task.
